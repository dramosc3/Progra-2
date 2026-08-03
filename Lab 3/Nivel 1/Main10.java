import java.util.Scanner;

// Main del Ejercicio 10

public class Main10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ejercicio10 ejercicio = new Ejercicio10();

        System.out.println("Ejercicio 10 - Validar contrasena minima");
        System.out.println("==============================================");
        System.out.println("Ingrese una contrasena de al menos 8 caracteres.");
        System.out.println();

        try {

            System.out.print("Contrasena: ");
            String contrasena = teclado.nextLine();

            ejercicio.validarContrasena(contrasena);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        teclado.close();

    }

}