public class Cuenta {

    // Atributo privado
    private double saldo;

    // Constructor
    public Cuenta(double saldoInicial) {

        if (saldoInicial >= 0) {

            saldo = saldoInicial;

        } else {

            saldo = 0;
            System.out.println("El saldo inicial no puede ser negativo.");
            System.out.println("Se asigno un saldo de Q0.00.");

        }

    }

    // Getter
    public double getSaldo() {

        return saldo;

    }

    // Metodo depositar
    public void depositar(double monto) {

        if (monto > 0) {

            saldo += monto;
            System.out.println("Deposito realizado correctamente.");

        } else {

            System.out.println("El monto a depositar debe ser mayor que cero.");

        }

    }

    // Metodo retirar
    public void retirar(double monto) {

        if (monto <= 0) {

            System.out.println("El monto debe ser mayor que cero.");

        } else if (monto > saldo) {

            System.out.println("Fondos insuficientes.");
            System.out.println("No es posible dejar el saldo negativo.");

        } else {

            saldo -= monto;
            System.out.println("Retiro realizado correctamente.");

        }

    }

    // Metodo mostrar saldo
    public void mostrarSaldo() {

        System.out.printf("Saldo actual: Q%.2f%n", saldo);

    }

}