// 19 - Validar numero mayor a 100

public class Ejercicio19 {

    public void validarNumero(int numero) throws Exception {

        if (numero <= 100) {

            throw new Exception("El numero debe ser mayor a 100.");

        }

        System.out.println("Numero valido.");

    }

}