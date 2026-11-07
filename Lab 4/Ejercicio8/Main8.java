import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[] notas = new double[5];

        System.out.println("Ingrese las 5 notas:");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
        }

        double promedio = Promedio8.calcularPromedio(notas);

        System.out.println("\nEl promedio es: " + promedio);

        teclado.close();
    }
}