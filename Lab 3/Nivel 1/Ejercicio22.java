// 22 - Validar longitud de texto

public class Ejercicio22 {

    public void validarTexto(String texto) throws Exception {

        if (texto.length() < 5) {

            throw new Exception("El texto debe contener al menos 5 caracteres.");

        }

        System.out.println("Texto valido.");

    }

}