import java.util.Scanner;

// Main del Ejercicio 11

public class Main11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ejercicio11 ejercicio = new Ejercicio11();

        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Ejercicio 11 - Indice fuera de rango");
        System.out.println("==============================================");
        System.out.println("El arreglo contiene 5 posiciones (0 al 4).");
        System.out.println();

        System.out.print("Ingrese el indice que desea consultar: ");
        int indice = teclado.nextInt();

        ejercicio.mostrarElemento(numeros, indice);

        teclado.close();

    }

}