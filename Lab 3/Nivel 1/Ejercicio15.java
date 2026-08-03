// 15 - Lanzar excepcion personalizada

public class Ejercicio15 {

    public void validarCalificacion(int nota) throws MiExcepcion {

        if (nota < 0 || nota > 100) {

            throw new MiExcepcion("La nota debe estar entre 0 y 100.");

        }

        System.out.println("Calificacion valida.");

    }

}