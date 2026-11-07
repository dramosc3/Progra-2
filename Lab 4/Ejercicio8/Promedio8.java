public class Promedio8 {

    public static double calcularPromedio(double[] notas) {

        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        return suma / notas.length;
    }
}