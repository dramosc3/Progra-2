import java.util.Scanner;

public class Validacion7 {

    public static double leerNumero(Scanner teclado) {

        while (true) {

            try {

                System.out.print("Ingrese un numero: ");
                double numero = teclado.nextDouble();

                return numero;

            } catch (Exception e) {

                System.out.println("Error: Debe ingresar un numero.");
                System.out.println("Vuelva a intentarlo.\n");

                teclado.nextLine(); // Limpia el buffer
            }
        }
    }
}