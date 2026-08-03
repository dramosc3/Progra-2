import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ejercicio01 ejercicio = new Ejercicio01();

        System.out.println("Ejercicio 1 - Capturar excepcion al dividir entre cero");
        System.out.println("==============================================");
        System.out.println("Este programa solicita dos numeros.");
        System.out.println("Si el segundo numero es cero, se mostrara un mensaje de error.");
        System.out.println();

        System.out.print("Ingrese el primer numero: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = teclado.nextInt();

        ejercicio.dividir(numero1, numero2);

        teclado.close();

    }

}