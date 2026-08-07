public class Validacion15 {

    //========================================
    // Validar nombre
    //========================================
    public static String validarNombre(String nombre) {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "El nombre no puede estar vacio."
            );
        }

        return nombre;
    }


    //========================================
    // Validar salario mensual
    //========================================
    public static double validarSalario(double salario) {

        if (salario <= 0) {
            throw new IllegalArgumentException(
                "El salario debe ser mayor que cero."
            );
        }

        return salario;
    }


    //========================================
    // Validar horas trabajadas
    //========================================
    public static double validarHoras(double horas) {

        if (horas <= 0) {
            throw new IllegalArgumentException(
                "Las horas trabajadas deben ser mayores que cero."
            );
        }

        return horas;
    }


    //========================================
    // Validar pago por hora
    //========================================
    public static double validarPagoHora(double pagoHora) {

        if (pagoHora <= 0) {
            throw new IllegalArgumentException(
                "El pago por hora debe ser mayor que cero."
            );
        }

        return pagoHora;
    }
}