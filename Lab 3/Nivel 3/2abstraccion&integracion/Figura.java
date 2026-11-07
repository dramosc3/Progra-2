public abstract class Figura {

    // Atributo protegido
    protected String nombre;

    // Constructor
    public Figura(String nombre) {

        this.nombre = nombre;

    }

    // Metodo abstracto
    public abstract double area();

    // Metodo para mostrar informacion
    public void mostrarInformacion() {

        System.out.printf("%s - Area: %.2f%n", nombre, area());

    }

}