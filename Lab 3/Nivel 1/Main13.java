import java.util.Scanner;

public class Main13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ejercicio13 ejercicio = new Ejercicio13();

        System.out.println("Ejercicio 13 - Usar throw manualmente");
        System.out.println("==============================================");
        System.out.println();

        try {

            System.out.print("Ingrese un numero diferente de cero: ");
            int numero = teclado.nextInt();

            ejercicio.validarNumero(numero);

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        }

        teclado.close();

    }

}