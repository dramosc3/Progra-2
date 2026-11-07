import java.util.Scanner;

public class Main19 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Ejercicio19 ejercicio = new Ejercicio19();

        System.out.println("Ejercicio 19 - Validar numero mayor a 100");
        System.out.println("==============================================");

        try {

            System.out.print("Ingrese un numero: ");
            int numero = teclado.nextInt();

            ejercicio.validarNumero(numero);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        teclado.close();

    }

}