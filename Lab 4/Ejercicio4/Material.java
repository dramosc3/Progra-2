public class Material {

    protected String titulo;

    public Material(String titulo) {
        this.titulo = titulo;
    }

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
    }
}