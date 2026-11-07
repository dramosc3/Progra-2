import java.util.Scanner;

public class MainFive {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int edad = Validador5.leerEdad(teclado);

        System.out.println("\nEdad registrada correctamente: " + edad);

        teclado.close();
    }
}