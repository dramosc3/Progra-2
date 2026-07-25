public class Auto3 {

    String marca;
    int velocidad;

    public Auto3(String marca) {
        this.marca = marca;
        velocidad = 0;
    }

    public void acelerar(int aumento) {
        velocidad += aumento;
    }

    public void frenar(int disminucion) {
        velocidad -= disminucion;

        if (velocidad < 0) {
            velocidad = 0;
        }
    }

    public void mostrarAuto() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad: " + velocidad + " km/h");
    }
}