public class Main {

    public static void main(String[] args) {

        Pago pago1 = new PagoTarjeta(250.00);
        Pago pago2 = new PagoEfectivo(150.00);

        pago1.procesarPago();
        System.out.println();

        pago2.procesarPago();
    }
}