// 3 - Manejar error al convertir texto a numero

public class Ejercicio03 {

    public void convertirNumero(String texto) {

        try {

            int numero = Integer.parseInt(texto);

            System.out.println("Conversion realizada correctamente.");
            System.out.println("Numero: " + numero);

        } catch (NumberFormatException e) {

            System.out.println("Error: El texto ingresado no puede convertirse a numero.");

        }

    }

}