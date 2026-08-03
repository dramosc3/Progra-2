import java.util.Scanner;

public class Main07 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ejercicio07 ejercicio = new Ejercicio07();

        System.out.println("Ejercicio 7 - Lanzar excepcion si el numero es negativo");
        System.out.println("==============================================");
        System.out.println();

        try {

            System.out.print("Ingrese un numero: ");
            int numero = teclado.nextInt();

            ejercicio.verificarNumero(numero);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        teclado.close();

    }

}