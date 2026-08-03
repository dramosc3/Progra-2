// Clase Persona

public class Persona {

    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {

        this.nombre = nombre;
        setEdad(edad);

    }

    // Getter del nombre
    public String getNombre() {

        return nombre;

    }

    // Setter del nombre
    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    // Getter de la edad
    public int getEdad() {

        return edad;

    }

    // Setter de la edad con validacion
    public void setEdad(int edad) {

        if (edad >= 0) {

            this.edad = edad;

        } else {

            System.out.println("La edad no puede ser negativa.");
            this.edad = 0;

        }

    }

    // Metodo para mostrar los datos
    public void mostrarDatos() {

        System.out.println();
        System.out.println("===== DATOS DE LA PERSONA =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

    }

}