// 12 - Manejar multiples excepciones

public class Ejercicio12 {

    public void procesar(String texto, int numero) {

        try {

            int valor = Integer.parseInt(texto);
            int resultado = valor / numero;

            System.out.println("Resultado: " + resultado);

        } catch (NumberFormatException e) {

            System.out.println("Error: El texto ingresado no es un numero.");

        } catch (ArithmeticException e) {

            System.out.println("Error: No se puede dividir entre cero.");

        }

    }

}