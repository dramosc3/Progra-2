// 6 - Pedir numero y validar que sea positivo

public class Ejercicio06 {

    public void validarPositivo(int numero) throws Exception {

        if (numero <= 0) {
            throw new Exception("El numero debe ser positivo.");
        }

        System.out.println("Numero valido: " + numero);

    }

}