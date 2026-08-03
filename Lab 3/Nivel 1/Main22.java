import java.util.Scanner;

public class Main22 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ejercicio22 ejercicio = new Ejercicio22();

        System.out.println("Ejercicio 22 - Validar longitud de texto");
        System.out.println("==============================================");
        System.out.println();

        try {

            System.out.print("Ingrese un texto: ");
            String texto = teclado.nextLine();

            ejercicio.validarTexto(texto);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        teclado.close();

    }

}