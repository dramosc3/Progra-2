import java.util.Scanner;

public class Main12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ejercicio12 ejercicio = new Ejercicio12();

        System.out.println("Ejercicio 12 - Manejar multiples excepciones");
        System.out.println("==============================================");
        System.out.println();

        System.out.print("Ingrese un numero en texto: ");
        String texto = teclado.nextLine();

        System.out.print("Ingrese un divisor: ");
        int numero = teclado.nextInt();

        ejercicio.procesar(texto, numero);

        teclado.close();

    }

}