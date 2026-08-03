// 21 - Crear metodo que valide un email simple

public class Ejercicio21 {

    public void validarEmail(String email) throws Exception {

        if (!email.contains("@") || !email.contains(".")) {

            throw new Exception("El correo electronico no es valido.");

        }

        System.out.println("Correo electronico valido.");

    }

}