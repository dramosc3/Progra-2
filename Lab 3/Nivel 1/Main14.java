import java.util.Scanner;

public class Main14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ejercicio14 ejercicio = new Ejercicio14();

        System.out.println("Ejercicio 14 - Excepcion personalizada");
        System.out.println("==============================================");
        System.out.println();

        try {

            System.out.print("Ingrese un nombre: ");
            String nombre = teclado.nextLine();

            ejercicio.validarNombre(nombre);

        } catch (MiExcepcion e) {

            System.out.println("Error: " + e.getMessage());

        }

        teclado.close();

    }

}