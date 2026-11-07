public class Empleado {

    // Atributos privados
    private String nombre;
    private String puesto;
    private double salario;

    // Constructor
    public Empleado(String nombre, String puesto, double salario) {

        this.nombre = nombre;
        this.puesto = puesto;
        setSalario(salario);

    }

    // Getter del nombre
    public String getNombre() {

        return nombre;

    }

    // Setter del nombre
    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    // Getter del puesto
    public String getPuesto() {

        return puesto;

    }

    // Setter del puesto
    public void setPuesto(String puesto) {

        this.puesto = puesto;

    }

    // Getter del salario
    public double getSalario() {

        return salario;

    }

    // Setter del salario con validacion
    public void setSalario(double salario) {

        if (salario > 0) {

            this.salario = salario;

        } else {

            System.out.println("El salario debe ser mayor que cero.");
            this.salario = 0;

        }

    }

    // Metodo para mostrar los datos
    public void mostrarDatos() {

        System.out.println("---------------------------------------");
        System.out.println("Nombre  : " + nombre);
        System.out.println("Puesto  : " + puesto);
        System.out.printf("Salario : Q%.2f%n", salario);

    }

}