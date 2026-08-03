import java.util.Scanner;

public class Main08 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ejercicio08 ejercicio = new Ejercicio08();

        System.out.println("Ejercicio 8 - Manejar excepcion en un metodo");
        System.out.println("==============================================");
        System.out.println();

        System.out.print("Ingrese el primer numero: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = teclado.nextInt();

        ejercicio.dividir(numero1, numero2);

        teclado.close();

    }

}