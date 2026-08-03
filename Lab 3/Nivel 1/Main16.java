import java.util.Scanner;

public class Main16 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Ejercicio16 ejercicio = new Ejercicio16();

        System.out.println("Ejercicio 16 - Validar que un texto no este vacio");
        System.out.println("==============================================");
        System.out.println("Ingrese cualquier texto.");
        System.out.println();

        try {

            System.out.print("Texto: ");
            String texto = teclado.nextLine();

            ejercicio.validarTexto(texto);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        teclado.close();

    }

}