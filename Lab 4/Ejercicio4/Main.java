public class Main {

    public static void main(String[] args) {

        Material material1 = new Libro("Programacion en Java");
        Material material2 = new Revista("National Geographic");

        material1.mostrarInformacion();
        System.out.println();

        material2.mostrarInformacion();
    }
}