import java.util.Scanner;

public class Main16 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {

            // Producto fisico

            System.out.println("===== PRODUCTO FISICO =====");

            System.out.print("Nombre: ");
            String nombreFisico = teclado.nextLine();

            System.out.print("Precio: ");
            double precioFisico = teclado.nextDouble();

            System.out.print("Peso en kg: ");
            double peso = teclado.nextDouble();

            Producto producto1 =
                new ProductoFisico(
                    nombreFisico,
                    precioFisico,
                    peso
                );


            teclado.nextLine();

            // Producto digital

            System.out.println("\n===== PRODUCTO DIGITAL =====");

            System.out.print("Nombre: ");
            String nombreDigital = teclado.nextLine();

            System.out.print("Precio: ");
            double precioDigital = teclado.nextDouble();

            System.out.print("Tamano del archivo en MB: ");
            double tamano = teclado.nextDouble();

            Producto producto2 =
                new ProductoDigital(
                    nombreDigital,
                    precioDigital,
                    tamano
                );

            // Mostrar informacion

            System.out.println("\n===== INFORMACION =====");

            producto1.mostrarInformacion();

            System.out.println();

            producto2.mostrarInformacion();


        } catch (IllegalArgumentException e) {

            System.out.println(
                "Error: " + e.getMessage()
            );

        } catch (Exception e) {

            System.out.println(
                "Error: Debe ingresar datos validos."
            );

        } finally {

            teclado.close();
        }
    }
}