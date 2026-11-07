public class Moto extends Vehiculo {

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("=== Moto ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
    }
}