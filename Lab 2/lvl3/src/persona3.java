public class persona3 {

    String nombre;
    int edad;

    // Constructor vacío
    public persona3() {
    }

    // Constructor con nombre
    public persona3(String nombre) {
        this.nombre = nombre;
    }

    // Constructor con nombre y edad
    public persona3(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}