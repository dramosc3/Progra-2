import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ejercicio05 ejercicio = new Ejercicio05();

        System.out.println("Ejercicio 5 - Usar finally para mostrar mensaje final");
        System.out.println("==============================================");
        System.out.println("Ingrese dos numeros para realizar una division.");
        System.out.println("Sin importar el resultado, el programa mostrara un mensaje final.");
        System.out.println();

        System.out.print("Ingrese el primer numero: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = teclado.nextInt();

        ejercicio.dividir(numero1, numero2);

        teclado.close();

    }

}