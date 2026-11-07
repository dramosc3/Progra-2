public class Estadisticas10 {

    public static double calcularSuma(double[] numeros) {

        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        return suma;
    }

    public static double calcularPromedio(double[] numeros) {
        return calcularSuma(numeros) / numeros.length;
    }

    public static double obtenerMayor(double[] numeros) {

        double mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        return mayor;
    }

    public static double obtenerMenor(double[] numeros) {

        double menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        return menor;
    }
}