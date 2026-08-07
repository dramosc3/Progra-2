public class EmpleadoPorHoras extends Empleado {

    private double horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHoras(
            String nombre,
            double horasTrabajadas,
            double pagoPorHora) {

        super(Validacion15.validarNombre(nombre));

        this.horasTrabajadas =
            Validacion15.validarHoras(horasTrabajadas);

        this.pagoPorHora =
            Validacion15.validarPagoHora(pagoPorHora);
    }

    @Override
    public double calcularPago() {

        return horasTrabajadas * pagoPorHora;
    }
}