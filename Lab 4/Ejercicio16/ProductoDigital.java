public class ProductoDigital extends Producto {

    private double tamanoArchivo;

    public ProductoDigital(
            String nombre,
            double precio,
            double tamanoArchivo) {

        super(nombre, precio);

        this.tamanoArchivo =
            Validacion16.validarTamanoArchivo(tamanoArchivo);
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("===== PRODUCTO DIGITAL =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: Q" + precio);
        System.out.println("Tamano: " + tamanoArchivo + " MB");
    }
}