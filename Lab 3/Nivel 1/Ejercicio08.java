// 8 - Manejar excepcion en metodo

public class Ejercicio08 {

    public void dividir(int numero1, int numero2) {

        try {

            int resultado = numero1 / numero2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Error: No se puede dividir entre cero.");

        }

    }

}