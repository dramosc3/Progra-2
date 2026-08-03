// 1 - Capturar excepcion al dividir entre cero

public class Ejercicio01 {

    public void dividir(int numero1, int numero2) {

        try {

            int resultado = numero1 / numero2;
            System.out.println("El resultado de la division es: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Error: No es posible dividir un numero entre cero.");

        }

    }

}