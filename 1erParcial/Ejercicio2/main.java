import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0, num2 = 0, num3 = 0;
        boolean num1Ingresado = false, num2Ingresado = false, num3Ingresado = false;
        
        System.out.println("Programa para encontrar el mayor de 3 numeros\n");
        
        while (!num1Ingresado || !num2Ingresado || !num3Ingresado) {
            try {
                if (!num1Ingresado) {
                    num1 = ValidadorNumeros.obtenerNumero(scanner, "Ingrese el primer numero: ");
                    num1Ingresado = true;
                }
                
                if (!num2Ingresado) {
                    num2 = ValidadorNumeros.obtenerNumero(scanner, "Ingrese el segundo numero: ");
                    num2Ingresado = true;
                }
                
                if (!num3Ingresado) {
                    num3 = ValidadorNumeros.obtenerNumero(scanner, "Ingrese el tercer numero: ");
                    num3Ingresado = true;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println();
            }
        }
        
        double mayor = EncontrarMayor.obtenerMayor(num1, num2, num3);
        
        System.out.println("\n Resultados ");
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
        System.out.println("Numero 3: " + num3);
        System.out.println("El mayor de los tres es: " + mayor);
        
        scanner.close();
    }
}