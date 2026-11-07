import java.util.InputMismatchException;
import java.util.Scanner;

// 23 - Controlar error en entrada de usuario

public class Ejercicio23 {

    public void leerNumero() {

        try (Scanner teclado = new Scanner(System.in)) {

            try {

                System.out.print("Ingrese un numero entero: ");
                int numero = teclado.nextInt();

                System.out.println("Numero ingresado: " + numero);

            } catch (InputMismatchException e) {

                System.out.println("Error: Debe ingresar un numero entero.");

            }

        }

    }

}