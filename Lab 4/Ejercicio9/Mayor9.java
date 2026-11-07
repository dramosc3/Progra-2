public class Mayor9 {

    public static double obtenerMayor(double num1, double num2, double num3) {

        double mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        return mayor;
    }
}