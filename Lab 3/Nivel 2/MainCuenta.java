import java.util.Scanner;

public class MainCuenta {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio 2 - Clase Cuenta");
        System.out.println("==============================================");
        System.out.println("Este programa permite depositar y retirar");
        System.out.println("dinero de una cuenta bancaria.");
        System.out.println();

        System.out.print("Ingrese el saldo inicial: Q");
        double saldoInicial = teclado.nextDouble();

        Cuenta cuenta = new Cuenta(saldoInicial);

        System.out.println();
        cuenta.mostrarSaldo();

        System.out.println();
        System.out.print("Ingrese el monto a depositar: Q");
        double deposito = teclado.nextDouble();

        cuenta.depositar(deposito);

        cuenta.mostrarSaldo();

        System.out.println();
        System.out.print("Ingrese el monto a retirar: Q");
        double retiro = teclado.nextDouble();

        cuenta.retirar(retiro);

        System.out.println();
        cuenta.mostrarSaldo();

        teclado.close();

    }

}