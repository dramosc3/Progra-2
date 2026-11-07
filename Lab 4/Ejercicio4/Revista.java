public class Revista extends Material {

    public Revista(String titulo) {
        super(titulo);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Revista ===");
        System.out.println("Titulo: " + titulo);
    }
}