public class Producto3 {

    String nombre;
    double precio;

    public Producto3(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: Q" + precio);
    }
}