import java.util.Scanner;

public class Main18 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Ejercicio18 ejercicio = new Ejercicio18();

        System.out.println("Ejercicio 18 - Division segura");
        System.out.println("==============================================");

        try {

            System.out.print("Ingrese el primer numero: ");
            int numero1 = teclado.nextInt();

            System.out.print("Ingrese el segundo numero: ");
            int numero2 = teclado.nextInt();

            int resultado = ejercicio.dividir(numero1, numero2);

            System.out.println("Resultado: " + resultado);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        teclado.close();

    }

}