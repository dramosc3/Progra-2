import java.util.ArrayList;
import java.util.Scanner;

public class MainProducto {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Producto> listaProductos = new ArrayList<>();

        System.out.println("Ejercicio 3 - Clase Producto");
        System.out.println("==============================================");
        System.out.println("Este programa crea una lista de productos.");
        System.out.println();

        System.out.print("¿Cuantos productos desea ingresar?: ");
        int cantidad = teclado.nextInt();
        teclado.nextLine();

        for (int i = 1; i <= cantidad; i++) {

            System.out.println();
            System.out.println("Producto " + i);

            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Precio: Q");
            double precio = teclado.nextDouble();
            teclado.nextLine();

            Producto producto = new Producto(nombre, precio);

            listaProductos.add(producto);

        }

        System.out.println();
        System.out.println("LISTA DE PRODUCTOS");
        System.out.println("==============================================");

        for (Producto producto : listaProductos) {

            producto.mostrarProducto();

        }

        teclado.close();

    }

}