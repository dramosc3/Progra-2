import java.util.Scanner;

public class Main06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ejercicio06 ejercicio = new Ejercicio06();

        System.out.println("Ejercicio 6 - Validar numero positivo");
        System.out.println("==============================================");
        System.out.println("Ingrese un numero positivo.");
        System.out.println();

        try {

            System.out.print("Numero: ");
            int numero = teclado.nextInt();

            ejercicio.validarPositivo(numero);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        teclado.close();

    }

}