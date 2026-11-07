public class Clasificacion11 {

    public static String clasificarEdad(int edad) {

        if (edad >= 0 && edad <= 12) {
            return "Niño";
        } else if (edad >= 13 && edad <= 17) {
            return "Adolescente";
        } else {
            return "Adulto";
        }
    }
}