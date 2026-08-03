public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {

        super("Circulo");
        this.radio = radio;

    }

    @Override
    public double area() {

        return Math.PI * radio * radio;

    }

}