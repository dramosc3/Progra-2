import java.util.Scanner;

public class MainPersona {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio 1 - Clase Persona");
        System.out.println("==============================================");
        System.out.println("Este programa crea un objeto Persona.");
        System.out.println("Ingrese el nombre y la edad.");
        System.out.println();

        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Edad: ");
        int edad = teclado.nextInt();

        Persona persona = new Persona(nombre, edad);

        persona.mostrarDatos();

        teclado.close();

    }

}