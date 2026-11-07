import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[] numeros = new double[5];

        System.out.println("Ingrese 5 numeros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
        }

        System.out.println("\nResultados:");
        System.out.println("Suma: " + Estadisticas10.calcularSuma(numeros));
        System.out.println("Promedio: " + Estadisticas10.calcularPromedio(numeros));
        System.out.println("Mayor: " + Estadisticas10.obtenerMayor(numeros));
        System.out.println("Menor: " + Estadisticas10.obtenerMenor(numeros));

        teclado.close();
    }
}