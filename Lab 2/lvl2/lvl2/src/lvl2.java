import java.util.Scanner;

public class lvl2 {
    public static void main(String[] args) {
        
        // NIVEL 2

        // 1 - Crear un arreglo de 3 números e imprimirlos.
        System.out.println("\n#1 - Crear un arreglo de 3 números e imprimirlos.");

        int[] numeros = {5, 10, 15};
        System.out.println("Los números en el arreglo son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }   

        // 2 - Crear un arreglo de 5 números e imprimirlos.
        System.out.println("\n#2 - Crear un arreglo de 5 números e imprimirlos.");
        int[] numeros2 = {1, 2, 3, 4, 5};
        System.out.println("Los números en el arreglo son:");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        // 3 - Sumar los elementos de un arreglo pequeño.
        System.out.println("\n#3 - Sumar los elementos de un arreglo pequeño.");
        int[] numeros3 = {2, 4, 6};
        int suma = 0;
        for (int i = 0; i < numeros3.length; i++) {
            suma += numeros3[i];
        }
        System.out.println("La suma de los elementos del arreglo es: " + suma);

        // 4 - Mostrar el mayor de un arreglo de 3 números.
        System.out.println("\n#4 - Mostrar el mayor de un arreglo de 3 números.");
        int[] numeros4 = {7, 3, 9};
        int mayor = numeros4[0];
        for (int i = 1; i < numeros4.length; i++) {
            if (numeros4[i] > mayor) {
                mayor = numeros4[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);

        // 5 - Mostrar el menor de un arreglo.
        System.out.println("\n#5 - Mostrar el menor de un arreglo.");
        int[] numeros5 = {12, 5, 8, 3, 10};
        int menor = numeros5[0];
        for (int i = 1; i < numeros5.length; i++) {
            if (numeros5[i] < menor) {
                menor = numeros5[i];
            }
        }
        System.out.println("El número menor es: " + menor);

        // 6 - Contar cuántos elementos tiene el arreglo.
        System.out.println("\n#6 - Contar cuántos elementos tiene el arreglo.");
        int[] numeros6 = {1, 2, 3, 4, 5};
        System.out.println("El arreglo tiene " + numeros6.length + " elementos.");

        // 7 - Imprimir cada elemento con for.
        System.out.println("\n#7 - Imprimir cada elemento con for.");
        int[] numeros7 = {10, 20, 30, 40, 50};
        for (int i = 0; i < numeros7.length; i++) {
            System.out.println("Elemento en la posición " + i + ": " + numeros7[i]);
        }

        // 8 - Crear un arreglo de nombres e imprimirlos.
        System.out.println("\n#8 - Crear un arreglo de nombres e imprimirlos.");
        String[] nombres = {"Alice", "Bob", "Charlie"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre en la posición " + i + ": " + nombres[i]);
        }

        // 9 - Mostrar el primer elemento del arreglo.
        System.out.println("\n#9 - Mostrar el primer elemento del arreglo.");
        int[] numeros9 = {100, 200, 300};
        System.out.println("El primer elemento del arreglo es: " + numeros9[0]);

        // 10 - Mostrar el último elemento.
        System.out.println("\n#10 - Mostrar el último elemento.");
        int[] numeros10 = {5, 10, 15, 20};
        System.out.println("El último elemento del arreglo es: " + numeros10[numeros10.length - 1]);    

        // 11 - Crear un método que imprima “Hola”.
        System.out.println("\n#11 - Crear un método que imprima “Hola”.");
        imprimirHola();

        // 12 - Crear método que reciba un número y lo imprima.
        System.out.println("\n#12 - Crear un método que reciba un número y lo imprima.");
        imprimirNumero(40);

        // 13 Método que sume dos números.
        System.out.println("\n#13 - Método que sume dos números.");
        sumar(10, 20);

        // 14 - Método que reste dos números.
        System.out.println("\n#14 - Método que reste dos números.");
        resta(30, 15);

        // 15 - Método que multiplique dos números.
        System.out.println("\n#15 - Método que multiplique dos números.");
        multiplicar(5, 4);

        // 16 - Método que divida dos números.
        System.out.println("\n#16 - Método que divida dos números.");
        dividir(20, 4);

        // 17 - Método que retorne un número fijo.
        System.out.println("\n#17 - Método que retorne un número fijo.");
        System.out.println("El número fijo es: " + retornarNumeroFijo());

        // 18 - Método que retorne la suma de dos números.
        System.out.println("\n#18 - Método que retorne la suma de dos números.");
        System.out.println("La suma de 10 + 5 es: " + sumardo2num(10, 5));

        // 19 - Método que retorne el mayor de dos números
        System.out.println("\n#19 - Método que retorne el mayor de dos números.");
        System.out.println("El mayor entre 10 y 20 es: " + mayor(10, 20));

        //20 - Método que indique si un número es par.
        System.out.println("\n#20 - Método que indique si un número es par.");
        System.out.println("El número 10 es par? " + esPar(10));
        System.out.println("El número 15 es par? " + esPar(15));

        // 21 - Método que reciba un texto y lo imprima.
        System.out.println("\n#21 - Método que reciba un texto y lo imprima.");
        imprimirTexto("Hola hola hola hola jaja!");

        // 22 - Método que reciba nombre y salude.
        System.out.println("\n#22 - Método que reciba nombre y salude.");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        saludar(nombre);

        entrada.close();

        // 23 - Método que imprima números del 1 al 5.
        System.out.println("\n#23 - Método que imprima números del 1 al 5.");
        imprimirNumeros();

        // 24 - Método que imprima números pares.
        System.out.println("\n\n#24 - Método que imprima números pares.");
        imprimirPares();

        // 25 - Método que calcule el doble de un número.
        System.out.println("\n#25 - Método que calcule el doble de un número.");
        int numero = 7;
        int doble = calcularDoble(numero);
        System.out.println("El doble de " + numero + " es: " + doble);

        // 26 -Método que calcule el triple.
        System.out.println("\n#26 - Método que calcule el triple.");
        int numero2 = 5;
        int triple = calcularTriple(numero2);
        System.out.println("El triple de " + numero2 + " es: " + triple);

        // 27 - Método que convierta a mayúsculas.
        System.out.println("\n#27 - Método que convierta a mayúsculas.");
        Scanner entrada2 = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = entrada2.nextLine();

        System.out.println("En mayúsculas: " + convertirMayusculas(texto));

        entrada2.close();

        // 28 - Método que cuente caracteres.
        System.out.println("\n#28 - Método que cuente caracteres.");

        Scanner entrada3 = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto28 = entrada3.nextLine();

        System.out.println("Cantidad de caracteres: " + contarCaracteres(texto28));

        entrada3.close();

        // 29 - Método que compare dos números.
        System.out.println("\n#29 - Método que compare dos números.");
        comparar(10, 5);
        comparar(8, 12);
        comparar(7, 7);

        // 30 - Método que valide si número es positivo.
        System.out.println("\n#30 - Método que valide si número es positivo.");
        Scanner entrada4 = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero12 = entrada4.nextInt();
        validarNumero(numero12);

        entrada4.close();

    }





    // METODOS

    // 11 - Crear un método que imprima “Hola”.
    public static void imprimirHola() {
        System.out.println("Hola");
    }

    // 12 - Crear método que reciba un número y lo imprima.
    public static void imprimirNumero(int numero) {
        System.out.println("El número recibido es: " + numero);
    }

    // 13 Método que sume dos números.
    public static int sumar(int num1, int num2) {
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
        return suma;
    }

    // 14 - Método que reste dos números.
    public static int resta(int num3, int num4) {
        int resta = num3 - num4;
        System.out.println("La resta es: " + resta);
        return resta;
    }

    // 15 - Método que multiplique dos números.
    public static int multiplicar(int num5, int num6) {
        int multiplicacion = num5 * num6;
        System.out.println("La multiplicación es: " + multiplicacion);
        return multiplicacion;
    }

    // 16 - Método que divida dos números.
    public static double dividir(double num7, double num8) {
        if (num8 == 0) {
            System.out.println("Error: División por cero no permitida.");
            return Double.NaN; // Retorna NaN si hay división por cero
        }
        double division = num7 / num8;
        System.out.println("La división es: " + division);
        return division;
    }

    // 17 - Método que retorne un número fijo.
    public static int retornarNumeroFijo() {
        return 42;
    }

    // 18 - Método que retorne la suma de dos números.
    public static int sumardo2num(int num1, int num2) {
        return num1 + num2;
    }
    
    // 19 - Método que retorne el mayor de dos números.
    public static int mayor(int num6, int num7) {
    return (num6 > num7) ? num6 : num7;
    }

    // 20 - Método que indique si un número es par.
    public static boolean esPar(int numero) {
    return numero % 2 == 0;
    }

    // 21 - Método que reciba un texto y lo imprima.
    public static void imprimirTexto(String texto) {
        System.out.println("El texto recibido es: " + texto);
    }

    // 22 - Método que reciba nombre y salude.
    public static void saludar(String nombre) {
        System.out.println("Hola " + nombre + ", bienvenido.");
    }

    // 23 - Método que imprima números del 1 al 5.
    public static void imprimirNumeros() {

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

    }

    // 24 - Método que imprima números pares.
    public static void imprimirPares() {

        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }

    }

    // 25 - Método que calcule el doble de un número.
     public static int calcularDoble(int numero) {
        return numero * 2;
    }

    // 26 -Método que calcule el triple.
     public static int calcularTriple(int numero) {
        return numero * 3;
    }

    // 27 - Método que convierta a mayúsculas.
    public static String convertirMayusculas(String texto) {
        return texto.toUpperCase();
    }
    
    // 28 - Método que cuente caracteres.
    public static int contarCaracteres(String texto) {
        return texto.length();
    }

    // 29 - Método que compare dos números.
    public static void comparar(int num10, int num11) {

        if (num10 > num11) {
            System.out.println(num10 + " es mayor que " + num11);
        } else if (num11 > num10) {
            System.out.println(num11 + " es mayor que " + num10);
        } else {
            System.out.println("Los dos números son iguales.");
        }

    }

    // 30 - Método que valide si número es positivo.
    public static void validarNumero(int numero) {

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

    }

}