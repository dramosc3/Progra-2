import java.util.Scanner;

public class MainEstudiante {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio - Clase Estudiante");
        System.out.println("=================================================");
        System.out.println("Este programa registra un estudiante,");
        System.out.println("valida que las notas esten entre 0 y 100");
        System.out.println("y calcula el promedio.");
        System.out.println();

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese la nota 1: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Ingrese la nota 2: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Ingrese la nota 3: ");
        double nota3 = teclado.nextDouble();

        Estudiante estudiante = new Estudiante(nombre, nota1, nota2, nota3);

        estudiante.mostrarResultado();

        teclado.close();

    }

}