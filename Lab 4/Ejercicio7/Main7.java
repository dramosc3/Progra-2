import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double numero = Validacion7.leerNumero(teclado);

        System.out.println("\nNumero ingresado: " + numero);

        teclado.close();
    }
}