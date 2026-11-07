public class Animal {

    // Atributo privado
    private String nombre;

    // Constructor
    public Animal(String nombre) {

        this.nombre = nombre;

    }

    // Getter
    public String getNombre() {

        return nombre;

    }

    // Setter
    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    // Metodo que sera sobrescrito
    public void sonido() {

        System.out.println(nombre + " hace un sonido.");

    }

}