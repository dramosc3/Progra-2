// 5 - Usar finally para mostrar mensaje final

public class Ejercicio05 {

    public void dividir(int numero1, int numero2) {

        try {

            int resultado = numero1 / numero2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Error: No se puede dividir entre cero.");

        } finally {

            System.out.println("El programa ha finalizado correctamente.");

        }

    }

}