public class Main {

    public static void main(String[] args) {

        Vehiculo v1 = new Carro("Toyota", "Corolla");
        Vehiculo v2 = new Moto("Honda", "CBR");

        v1.mostrarDatos();
        System.out.println();

        v2.mostrarDatos();
    }
}