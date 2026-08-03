import java.util.Scanner;

// Main del Ejercicio 3

public class Main03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ejercicio03 ejercicio = new Ejercicio03();

        System.out.println("Ejercicio 3 - Manejar error al convertir texto a numero");
        System.out.println("==============================================");
        System.out.println("Ingrese un valor para convertirlo a numero.");
        System.out.println();

        System.out.print("Ingrese un texto: ");
        String texto = teclado.nextLine();

        ejercicio.convertirNumero(texto);

        teclado.close();

    }

}