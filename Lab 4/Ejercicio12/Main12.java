import java.util.Scanner;

public class Main12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;
        double num1, num2;

        System.out.println("===== MENU =====");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.print("Seleccione una opcion: ");
        opcion = teclado.nextInt();

        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextDouble();

        switch (opcion) {

            case 1:
                System.out.println("\nResultado: " + Menu12.sumar(num1, num2));
                break;

            case 2:
                System.out.println("\nResultado: " + Menu12.restar(num1, num2));
                break;

            default:
                System.out.println("\nOpcion no valida.");
        }

        teclado.close();
    }
}