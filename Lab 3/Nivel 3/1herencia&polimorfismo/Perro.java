public class Perro extends Animal {

    // Constructor
    public Perro(String nombre) {

        super(nombre);

    }

    // Sobrescritura del metodo sonido
    @Override
    public void sonido() {

        System.out.println(getNombre() + " dice: Guau Guau");

    }

}