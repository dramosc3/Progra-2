import java.util.Scanner;

class ValidadorNumeros {
    public static double obtenerNumero(Scanner scanner, String mensaje) throws NumberFormatException {
        System.out.print(mensaje);
        String entrada = scanner.nextLine();
        try {
            return Double.parseDouble(entrada);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Error: '" + entrada + "' no es un numero valido. Intente nuevamente.");
        }
    }
}