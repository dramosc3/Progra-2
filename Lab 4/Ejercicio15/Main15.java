import java.util.Scanner;

public class Main15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {

            // Empleado tiempo completo

            System.out.println("===== EMPLEADO TIEMPO COMPLETO =====");

            System.out.print("Nombre: ");
            String nombre1 = teclado.nextLine();

            System.out.print("Salario mensual: ");
            double salario = teclado.nextDouble();

            Empleado empleado1 =
                new EmpleadoTiempoCompleto(nombre1, salario);


            teclado.nextLine();

            // Empleado por horas

            System.out.println("\n===== EMPLEADO POR HORAS =====");

            System.out.print("Nombre: ");
            String nombre2 = teclado.nextLine();

            System.out.print("Horas trabajadas: ");
            double horas = teclado.nextDouble();

            System.out.print("Pago por hora: ");
            double pagoHora = teclado.nextDouble();

            Empleado empleado2 =
                new EmpleadoPorHoras(
                    nombre2,
                    horas,
                    pagoHora
                );

            // Mostrar resultados

            System.out.println("\n===== RESULTADOS =====");

            System.out.println(
                "Empleado: " + empleado1.getNombre()
            );

            System.out.println(
                "Pago: Q" + empleado1.calcularPago()
            );


            System.out.println();

            System.out.println(
                "Empleado: " + empleado2.getNombre()
            );

            System.out.println(
                "Pago: Q" + empleado2.calcularPago()
            );


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