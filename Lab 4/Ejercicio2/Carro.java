public class Carro extends Vehiculo {

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("=== Carro ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
    }
}