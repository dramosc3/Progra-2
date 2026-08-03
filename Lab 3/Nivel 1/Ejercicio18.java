// 18 - Validar division segura con metodo

public class Ejercicio18 {

    public int dividir(int numero1, int numero2) throws Exception {

        if (numero2 == 0) {
            throw new Exception("No se puede dividir entre cero.");
        }

        return numero1 / numero2;

    }

}