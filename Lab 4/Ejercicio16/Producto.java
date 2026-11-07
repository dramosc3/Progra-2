public class Producto {

    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {

        this.nombre = Validacion16.validarNombre(nombre);

        this.precio = Validacion16.validarPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void mostrarInformacion() {

        System.out.println("Producto: " + nombre);
        System.out.println("Precio: Q" + precio);
    }
}