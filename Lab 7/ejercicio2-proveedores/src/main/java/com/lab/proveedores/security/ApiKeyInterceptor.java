package com.lab.proveedores.security;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * Valida la API Key (header X-API-KEY) antes de permitir el acceso a los endpoints.
 * Si falta o es incorrecta responde 401 UNAUTHORIZED.
 */
@Component
public class ApiKeyInterceptor implements HandlerInterceptor {

    public static final String HEADER_API_KEY = "X-API-KEY";

    private final String apiKeyEsperada;

    public ApiKeyInterceptor(@Value("${app.security.api-key}") String apiKeyEsperada) {
        this.apiKeyEsperada = apiKeyEsperada;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws IOException {
        String apiKeyRecibida = request.getHeader(HEADER_API_KEY);

        if (apiKeyRecibida != null && coincide(apiKeyRecibida)) {
            return true;
        }

        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(
                "{\"status\":401,\"error\":\"UNAUTHORIZED\",\"mensaje\":\"API Key ausente o inválida\"}");
        return false;
    }

    private boolean coincide(String apiKeyRecibida) {
        return MessageDigest.isEqual(
                apiKeyRecibida.getBytes(StandardCharsets.UTF_8),
                apiKeyEsperada.getBytes(StandardCharsets.UTF_8));
    }
}
