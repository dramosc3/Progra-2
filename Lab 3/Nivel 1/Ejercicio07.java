// 7 - Crear metodo que lance excepcion si numero es negativo

public class Ejercicio07 {

    public void verificarNumero(int numero) throws Exception {

        if (numero < 0) {
            throw new Exception("El numero no puede ser negativo.");
        }

        System.out.println("El numero es valido.");

    }

}