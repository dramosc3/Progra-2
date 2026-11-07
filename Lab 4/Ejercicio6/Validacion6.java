import java.util.Scanner;

public class Validacion6 {

    public static double dividir(Scanner teclado) {

        while (true) {

            try {

                System.out.print("Ingrese el primer numero: ");
                double num1 = teclado.nextDouble();

                System.out.print("Ingrese el segundo numero: ");
                double num2 = teclado.nextDouble();

                if (num2 == 0) {
                    throw new ArithmeticException("No se puede dividir entre cero.");
                }

                return num1 / num2;

            } catch (ArithmeticException e) {

                System.out.println("Error: " + e.getMessage());
                System.out.println("Vuelva a intentarlo.\n");

            } catch (Exception e) {

                System.out.println("Error: Debe ingresar un numero valido.");
                System.out.println("Vuelva a intentarlo.\n");

                teclado.nextLine(); // Limpia el buffer
            }
        }
    }
}