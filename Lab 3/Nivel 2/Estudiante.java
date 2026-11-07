public class Estudiante {

    // Atributos privados
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    // Constructor
    public Estudiante(String nombre, double nota1, double nota2, double nota3) {

        this.nombre = nombre;

        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);

    }

    // Getter del nombre
    public String getNombre() {

        return nombre;

    }

    // Setter del nombre
    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    // Getter y Setter Nota 1
    public double getNota1() {

        return nota1;

    }

    public void setNota1(double nota1) {

        if (nota1 >= 0 && nota1 <= 100) {

            this.nota1 = nota1;

        } else {

            System.out.println("La nota 1 debe estar entre 0 y 100.");
            this.nota1 = 0;

        }

    }

    // Getter y Setter Nota 2
    public double getNota2() {

        return nota2;

    }

    public void setNota2(double nota2) {

        if (nota2 >= 0 && nota2 <= 100) {

            this.nota2 = nota2;

        } else {

            System.out.println("La nota 2 debe estar entre 0 y 100.");
            this.nota2 = 0;

        }

    }

    // Getter y Setter Nota 3
    public double getNota3() {

        return nota3;

    }

    public void setNota3(double nota3) {

        if (nota3 >= 0 && nota3 <= 100) {

            this.nota3 = nota3;

        } else {

            System.out.println("La nota 3 debe estar entre 0 y 100.");
            this.nota3 = 0;

        }

    }

    // Metodo para calcular el promedio
    public double calcularPromedio() {

        return (nota1 + nota2 + nota3) / 3;

    }

    // Metodo para mostrar los datos
    public void mostrarResultado() {

        System.out.println();
        System.out.println("========== DATOS DEL ESTUDIANTE ==========");
        System.out.println("Nombre   : " + nombre);
        System.out.println("Nota 1   : " + nota1);
        System.out.println("Nota 2   : " + nota2);
        System.out.println("Nota 3   : " + nota3);
        System.out.printf("Promedio : %.2f%n", calcularPromedio());

    }

}