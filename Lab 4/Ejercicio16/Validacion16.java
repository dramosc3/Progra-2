public class Validacion16 {

    // Validar nombre del producto

    public static String validarNombre(String nombre) {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "El nombre del producto no puede estar vacio."
            );
        }

        return nombre;
    }

    // Validar precio

    public static double validarPrecio(double precio) {

        if (precio <= 0) {
            throw new IllegalArgumentException(
                "El precio debe ser mayor que cero."
            );
        }

        return precio;
    }

    // Validar peso

    public static double validarPeso(double peso) {

        if (peso <= 0) {
            throw new IllegalArgumentException(
                "El peso debe ser mayor que cero."
            );
        }

        return peso;
    }

    // Validar tamano del archivo

    public static double validarTamanoArchivo(double tamano) {

        if (tamano <= 0) {
            throw new IllegalArgumentException(
                "El tamano del archivo debe ser mayor que cero."
            );
        }

        return tamano;
    }
}