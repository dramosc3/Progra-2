// 9 - Validar edad

public class Ejercicio09 {

    public void validarEdad(int edad) throws Exception {

        if (edad < 0) {
            throw new Exception("La edad no puede ser negativa.");
        }

        System.out.println("Edad valida: " + edad + " anios.");

    }

}