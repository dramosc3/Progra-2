import java.util.Scanner;

public class Main09 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ejercicio09 ejercicio = new Ejercicio09();

        System.out.println("Ejercicio 9 - Validar edad");
        System.out.println("==============================================");
        System.out.println();

        try {

            System.out.print("Ingrese su edad: ");
            int edad = teclado.nextInt();

            ejercicio.validarEdad(edad);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        teclado.close();

    }

}