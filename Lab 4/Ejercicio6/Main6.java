import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double resultado = Validacion6.dividir(teclado);

        System.out.println("\nResultado de la division: " + resultado);

        teclado.close();
    }
}