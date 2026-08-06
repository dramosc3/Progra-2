import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la edad: ");
        int edad = teclado.nextInt();

        String clasificacion = Clasificacion11.clasificarEdad(edad);

        System.out.println("\nClasificacion: " + clasificacion);

        teclado.close();
    }
}