public class Main20 {

    public static void main(String[] args) {

        Ejercicio20 ejercicio = new Ejercicio20();

        System.out.println("Ejercicio 20 - Simular error controlado");
        System.out.println("==============================================");

        try {

            ejercicio.generarError();

        } catch (RuntimeException e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}