import java.util.Scanner;

public class Main21 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ejercicio21 ejercicio = new Ejercicio21();

        System.out.println("Ejercicio 21 - Validar correo electronico");
        System.out.println("==============================================");
        System.out.println("Ingrese un correo electronico.");
        System.out.println();

        try {

            System.out.print("Correo: ");
            String email = teclado.nextLine();

            ejercicio.validarEmail(email);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        teclado.close();

    }

}