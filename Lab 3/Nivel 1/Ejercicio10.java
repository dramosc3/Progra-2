// 10 - Validar contrasena minima

public class Ejercicio10 {

    public void validarContrasena(String contrasena) throws Exception {

        if (contrasena.length() < 8) {
            throw new Exception("La contrasena debe contener al menos 8 caracteres.");
        }

        System.out.println("Contrasena valida.");

    }

}