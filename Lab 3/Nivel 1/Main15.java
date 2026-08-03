import java.util.Scanner;

public class Main15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ejercicio15 ejercicio = new Ejercicio15();

        System.out.println("Ejercicio 15 - Lanzar excepcion personalizada");
        System.out.println("==============================================");
        System.out.println();

        try {

            System.out.print("Ingrese una calificacion: ");
            int nota = teclado.nextInt();

            ejercicio.validarCalificacion(nota);

        } catch (MiExcepcion e) {

            System.out.println("Error: " + e.getMessage());

        }

        teclado.close();

    }

}