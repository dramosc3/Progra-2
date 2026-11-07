import java.util.Scanner;

public class Validador5 {

    public static int leerEdad(Scanner teclado) {

        while (true) {

            try {

                System.out.print("Ingrese su edad: ");
                int edad = teclado.nextInt();

                if (edad <= 0) {
                    throw new IllegalArgumentException("La edad debe ser mayor que cero.");
                }

                return edad;

            } catch (IllegalArgumentException e) {

                System.out.println("Error: " + e.getMessage());
                System.out.println("Vuelva a intentarlo.\n");

            } catch (Exception e) {

                System.out.println("Error: Debe ingresar un numero entero.");
                System.out.println("Vuelva a intentarlo.\n");

                teclado.nextLine(); // Limpia el buffer
            }
        }
    }
}