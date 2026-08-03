public class Gato extends Animal {

    // Constructor
    public Gato(String nombre) {

        super(nombre);

    }

    // Sobrescritura del metodo sonido
    @Override
    public void sonido() {

        System.out.println(getNombre() + " dice: Miau Miau");

    }

}