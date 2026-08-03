import java.util.InputMismatchException;
import java.util.Scanner;

// 2 - Validar entrada numerica con try-catch

public class Ejercicio02 {

    public void validarNumero() {

        try (Scanner teclado = new Scanner(System.in)) {

            System.out.print("Ingrese un numero entero: ");
            int numero = teclado.nextInt();

            System.out.println("El numero ingresado es: " + numero);

        } catch (InputMismatchException e) {

            System.out.println("Error: Debe ingresar un numero entero.");

        }

    }

}