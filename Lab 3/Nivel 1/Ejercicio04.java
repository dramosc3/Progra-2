// 4 - Mostrar mensaje personalizado en excepcion

public class Ejercicio04 {

    public void dividir(int numero1, int numero2) {

        try {

            int resultado = numero1 / numero2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Ocurrio un error personalizado.");
            System.out.println("No es posible realizar una division entre cero.");

        }

    }

}