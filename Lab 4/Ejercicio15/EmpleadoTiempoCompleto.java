public class EmpleadoTiempoCompleto extends Empleado {

    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, double salarioMensual) {

        super(Validacion15.validarNombre(nombre));

        this.salarioMensual =
            Validacion15.validarSalario(salarioMensual);
    }

    @Override
    public double calcularPago() {
        return salarioMensual;
    }
}