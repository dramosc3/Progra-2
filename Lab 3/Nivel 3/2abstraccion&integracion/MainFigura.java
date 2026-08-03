import java.util.ArrayList;

public class MainFigura {

    public static void main(String[] args) {

        System.out.println("Nivel 3 - Abstraccion, Polimorfismo e Interfaces");
        System.out.println("=================================================");
        System.out.println();

        // Crear lista de figuras

        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Cuadrado(8));
        figuras.add(new Circulo(5));

        System.out.println("========== FIGURAS ==========");

        for (Figura figura : figuras) {

            figura.mostrarInformacion();

        }

        System.out.println();

        System.out.println("========== VEHICULOS ==========");

        Vehiculo carro = new Carro();
        Vehiculo moto = new Moto();

        System.out.println();
        System.out.println("Carro:");

        carro.acelerar();
        carro.frenar();

        System.out.println();

        System.out.println("Moto:");

        moto.acelerar();
        moto.frenar();

    }

}