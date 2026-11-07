public class Libro extends Material {

    public Libro(String titulo) {
        super(titulo);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Libro ===");
        System.out.println("Titulo: " + titulo);
    }
}