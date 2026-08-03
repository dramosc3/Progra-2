import java.util.Scanner;

// Main del Ejercicio 4

public class Main04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ejercicio04 ejercicio = new Ejercicio04();

        System.out.println("Ejercicio 4 - Mostrar mensaje personalizado en excepcion");
        System.out.println("==============================================");
        System.out.println("Ingrese dos numeros para realizar una division.");
        System.out.println();

        System.out.print("Ingrese el primer numero: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = teclado.nextInt();

        ejercicio.dividir(numero1, numero2);

        teclado.close();

    }

}