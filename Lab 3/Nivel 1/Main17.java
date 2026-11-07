import java.util.Scanner;

public class Main17 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Ejercicio17 ejercicio = new Ejercicio17();

        System.out.println("Ejercicio 17 - Manejar error con charAt");
        System.out.println("==============================================");

        System.out.print("Ingrese un texto: ");
        String texto = teclado.nextLine();

        System.out.print("Ingrese la posicion que desea consultar: ");
        int posicion = teclado.nextInt();

        ejercicio.obtenerCaracter(texto, posicion);

        teclado.close();

    }

}