public class Pago {

    protected double monto;

    public Pago(double monto) {
        this.monto = monto;
    }

    public void procesarPago() {
        System.out.println("Procesando pago...");
    }
}