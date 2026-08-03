import java.util.InputMismatchException;
import java.util.Scanner;

// 24 - Reintentar lectura si ocurre un error

public class Ejercicio24 {

    public void leerNumero() {

        Scanner teclado = new Scanner(System.in);

        boolean valido = false;

        while (!valido) {

            try {

                System.out.print("Ingrese un numero entero: ");
                int numero = teclado.nextInt();

                System.out.println("Numero ingresado: " + numero);

                valido = true;

            } catch (InputMismatchException e) {

                System.out.println("Error: Debe ingresar un numero entero.");

                teclado.nextLine();

            }

        }

    }

}