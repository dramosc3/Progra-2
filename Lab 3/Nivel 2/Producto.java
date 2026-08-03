import java.text.DecimalFormat;

public class Producto {

    // Atributos privados
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {

        this.nombre = nombre;
        setPrecio(precio);

    }

    // Getter del nombre
    public String getNombre() {

        return nombre;

    }

    // Setter del nombre
    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    // Getter del precio
    public double getPrecio() {

        return precio;

    }

    // Setter del precio con validacion
    public void setPrecio(double precio) {

        if (precio > 0) {

            this.precio = precio;

        } else {

            System.out.println("El precio debe ser mayor que cero.");
            this.precio = 0;

        }

    }

    // Metodo para mostrar el producto
    public void mostrarProducto() {

        DecimalFormat formato = new DecimalFormat("#,##0.00");

        System.out.println("-----------------------------");
        System.out.println("Nombre : " + nombre);
        System.out.println("Precio : Q" + formato.format(precio));

    }

}