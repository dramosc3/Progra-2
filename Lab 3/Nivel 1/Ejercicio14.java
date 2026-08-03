// 14 - Crear excepcion personalizada simple

public class Ejercicio14 {

    public void validarNombre(String nombre) throws MiExcepcion {

        if (nombre.isEmpty()) {

            throw new MiExcepcion("El nombre no puede estar vacio.");

        }

        System.out.println("Nombre valido.");

    }

}