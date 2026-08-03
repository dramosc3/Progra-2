// 13 - Usar throw manualmente

public class Ejercicio13 {

    public void validarNumero(int numero) {

        if (numero == 0) {

            throw new ArithmeticException("No se permite ingresar cero.");

        }

        System.out.println("Numero valido.");

    }

}