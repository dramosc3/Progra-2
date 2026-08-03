import java.util.ArrayList;
import java.util.Scanner;

public class MainEmpleado {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        System.out.println("Ejercicio - Clase Empleado");
        System.out.println("=================================================");
        System.out.println("Este programa registra varios empleados.");
        System.out.println("El salario debe ser mayor que cero.");
        System.out.println();

        System.out.print("¿Cuantos empleados desea ingresar?: ");
        int cantidad = teclado.nextInt();
        teclado.nextLine();

        for (int i = 1; i <= cantidad; i++) {

            System.out.println();
            System.out.println("Empleado " + i);

            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Puesto: ");
            String puesto = teclado.nextLine();

            System.out.print("Salario: Q");
            double salario = teclado.nextDouble();
            teclado.nextLine();

            Empleado empleado = new Empleado(nombre, puesto, salario);

            listaEmpleados.add(empleado);

        }

        System.out.println();
        System.out.println("============== EMPLEADOS REGISTRADOS ==============");

        for (Empleado empleado : listaEmpleados) {

            empleado.mostrarDatos();

        }

        teclado.close();

    }

}