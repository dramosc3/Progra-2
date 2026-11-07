// 16 - Validar que un texto no este vacio

public class Ejercicio16 {

    public void validarTexto(String texto) throws Exception {

        if (texto.trim().isEmpty()) {
            throw new Exception("El texto no puede estar vacio.");
        }

        System.out.println("Texto valido: " + texto);

    }

}