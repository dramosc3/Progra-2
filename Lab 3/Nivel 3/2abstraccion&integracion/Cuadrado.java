public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double lado) {

        super("Cuadrado");
        this.lado = lado;

    }

    @Override
    public double area() {

        return lado * lado;

    }

}