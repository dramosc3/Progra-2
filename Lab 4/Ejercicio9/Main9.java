import java.util.Scanner;

public class Main9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double num1 = teclado.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double num2 = teclado.nextDouble();

        System.out.print("Ingrese el tercer numero: ");
        double num3 = teclado.nextDouble();

        double mayor = Mayor9.obtenerMayor(num1, num2, num3);

        System.out.println("\nEl numero mayor es: " + mayor);

        teclado.close();
    }
}