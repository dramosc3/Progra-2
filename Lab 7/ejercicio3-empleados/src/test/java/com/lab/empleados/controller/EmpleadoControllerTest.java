package com.lab.empleados.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class EmpleadoControllerTest {

    private static final String URL = "/api/empleados";
    private static final String HEADER = "X-API-KEY";

    @Autowired
    private MockMvc mockMvc;

    @Value("${app.security.api-key}")
    private String apiKey;

    @Test
    void sinApiKey_debeRetornar401() throws Exception {
        mockMvc.perform(get(URL))
                .andExpect(status().isUnauthorized());
    }

    @Test
    void conApiKeyInvalida_debeRetornar401() throws Exception {
        mockMvc.perform(get(URL).header(HEADER, "clave-incorrecta"))
                .andExpect(status().isUnauthorized());
    }

    @Test
    void crearEmpleadoValido_debeRetornar201() throws Exception {
        String json = """
                {"nombre":"Ana","apellido":"López","correo":"ana@empresa.com","especialidad":"Contabilidad"}
                """;

        mockMvc.perform(post(URL).header(HEADER, apiKey)
                        .contentType(MediaType.APPLICATION_JSON).content(json))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").isNumber())
                .andExpect(jsonPath("$.estado").value("ACTIVO"));
    }

    @Test
    void crearEmpleadoConNombreVacio_debeRetornar400() throws Exception {
        String json = """
                {"nombre":"","apellido":"López","correo":"ana@empresa.com","especialidad":"Contabilidad"}
                """;

        mockMvc.perform(post(URL).header(HEADER, apiKey)
                        .contentType(MediaType.APPLICATION_JSON).content(json))
                .andExpect(status().isBadRequest());
    }

    @Test
    void crearEmpleadoConCorreoInvalido_debeRetornar400() throws Exception {
        String json = """
                {"nombre":"Ana","apellido":"López","correo":"correo-invalido","especialidad":"Contabilidad"}
                """;

        mockMvc.perform(post(URL).header(HEADER, apiKey)
                        .contentType(MediaType.APPLICATION_JSON).content(json))
                .andExpect(status().isBadRequest());
    }

    @Test
    void consultarEmpleadoInexistente_debeRetornar404() throws Exception {
        mockMvc.perform(get(URL + "/9999").header(HEADER, apiKey))
                .andExpect(status().isNotFound());
    }
}
