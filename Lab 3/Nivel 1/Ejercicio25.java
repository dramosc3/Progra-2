import java.util.InputMismatchException;
import java.util.Scanner;

// 25 - Menu con manejo de errores

public class Ejercicio25 {

    public void mostrarMenu() {

        Scanner teclado = new Scanner(System.in);

        try {

            System.out.println();
            System.out.println("===== MENU =====");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar fecha");
            System.out.println("3. Salir");
            System.out.println();

            System.out.print("Seleccione una opcion: ");
            int opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Hola, bienvenido.");
                    break;

                case 2:
                    System.out.println("Hoy es un excelente dia para programar.");
                    break;

                case 3:
                    System.out.println("Hasta luego.");
                    break;

                default:
                    System.out.println("Opcion no valida.");

            }

        } catch (InputMismatchException e) {

            System.out.println("Error: Debe ingresar un numero.");

        }

    }

}