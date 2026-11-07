public class PagoTarjeta extends Pago {

    public PagoTarjeta(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        System.out.println("Pago con tarjeta realizado.");
        System.out.println("Monto: Q" + monto);
    }
}