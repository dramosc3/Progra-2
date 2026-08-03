import java.util.ArrayList;

public class MainAnimal {

    public static void main(String[] args) {

        System.out.println("Nivel 3 - Herencia y Polimorfismo");
        System.out.println("==================================================");
        System.out.println("Este programa demuestra:");
        System.out.println("- Herencia.");
        System.out.println("- Sobrescritura de metodos.");
        System.out.println("- Polimorfismo.");
        System.out.println();

        // Crear objetos

        Animal animal = new Animal("Animal");
        Perro perro = new Perro("Firulais");
        Gato gato = new Gato("Michi");

        System.out.println("======== HERENCIA ========");

        animal.sonido();
        perro.sonido();
        gato.sonido();

        System.out.println();

        System.out.println("======== POLIMORFISMO ========");

        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(animal);
        animales.add(perro);
        animales.add(gato);

        for (Animal a : animales) {

            a.sonido();

        }

    }

}