package Ejercicio1;

public class Main {

    public static void main(String[] args) {

        Vehiculo v1 = new Carro("Honda", "Civic");
        Vehiculo v2 = new Moto("Honda", "Navi");

        v1.mostrarDatos();
        System.out.println();

        v2.mostrarDatos();
    }
}