import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
    // NIVEL 1
    
        // #1 - HOLA MUNDO
        System.out.println("#1 - HOLA MUNDO \nHello, World!\n");
       
        // #2 - MI NOMBRE
        System.out.println("#2 - MI NOMBRE \nDIEGO ALEJANDRO RAMOS CASADO\n"); 
       
        // #3 - Variable INT y mostrar su valor
        int n_alumnos = 23;
        System.out.println("#3 - Variable INT y mostrar su valor \nEl número de alumnos en el curso es de " + n_alumnos ); 

        // #4 variable double y mostrarla
        double estatura_mts = 1.67;
        System.out.println("\n#4 variable double y mostrarla \nMi estatura en metros es de " + estatura_mts );

        // #5 String con tu ciudad
        String nombre_ciudad = "Ciudad de Guatemala";
        System.out.println( "\n#5 String con tu ciudad \nEl nombre de mi ciudad es " + nombre_ciudad);

        // #6 suma de 2 números definidos en el código.
        Double num1 = 0.43, num2 = 0.57, resultado1 = num1+num2;
        System.out.println("\n#6 suma de 2 números definidos en el código \nLa suma de " + num1 + " y " + num2 + " es de " + resultado1 + "\n");

        // #7 Restar dos números
        Double num3 = 1000.01, num4 = 0.01, resultado2 = num3-num4;
        System.out.println("#7 Restar dos números \nLa resta de " + num3 + " y " + num4 + " es de " + resultado2 + "\n");

        // #8 Multiplicar dos números
        int num5 = 4, num6 = 4, resultado3 = num5*num6;
        System.out.println("#8 Multiplicar dos números \nLa multiplicación de " + num5 + " y " + num6 + " es de " + resultado3 + "\n");

        // #9 Dividir dos números
        int num7 = 100, num8 = 4, resultado4 = num7/num8;
        System.out.println("#9 Dividir dos números \nLa división de " + num7 + " y " + num8 + " es de " + resultado4 + "\n");

        // #10 Mostrar el resultado de varias operaciones juntas
        double varias_operaciones = (resultado1 + resultado2) / (resultado3 - resultado4);
        System.out.println("#10 Operaciones combinadas \nEl resultado de las operaciones combinadas (resultado1 + resultado2) / (resultado3 - resultado4) = " + varias_operaciones + "\n");

        // #11 Declarar dos números y mostrar cuál es mayor
        int num9 = 10, num10 = 20;
        String texto11 = "#11 Declarar dos números y mostrar cuál es mayor\n";
        if (num9 > num10) {
            System.out.println(texto11 + "El número " + num9 + " es mayor que el número " + num10 + "\n");
        } else if (num9 < num10) {
            System.out.println(texto11 + "El número " + num10 + " es mayor que el número " + num9 + "\n");
        } else {
            System.out.println(texto11 + "Los números " + num9 + " y " + num10 + " son iguales\n");
        }
   
        // #12 Mostrar si un número es positivo o negativo
        int num11 = -5;
        System.out.println("#12 Mostrar si un número es positivo o negativo \nEl número " + num11 + " es " + (num11 >= 0 ? "positivo" : "negativo") + "\n");
   
        // #13 Mostrar si un número es par o impar
        int num12 = 7;
        System.out.println("#13 Mostrar si un número es par o impar \nEl número "+ num12 + " es " + (num12 % 2 == 0 ? "par" : "impar") + "\n");

        // #14 Cambiar el valor de una variable y mostrar el nuevo valor
        String nombre = "Diego";
        System.out.println("#14 Cambiar el valor de una variable y mostrar el nuevo valor \nEl valor original de la variable nombre es: " + nombre);
        nombre = "Alejandro";  
        System.out.println("El nuevo valor de la variable nombre es: " + nombre + "\n");

        // #15 Concatenar dos textos
        String texto1 = "Hola, ";
        String texto2 = "como estas?";
        String texto_concatenado = texto1 + texto2;
        System.out.println("\n#15 Concatenar dos textos \nEl texto concatenado es: " + texto_concatenado + "\n");

        // #16 Mostrar la longitud de un texto
        String texto3 = "Paranguacutirimicuaro";
        System.out.println("#16 Mostrar la longitud de un texto \nLa longitud del texto \"" + texto3 + "\" es: " + texto3.length() + "\n");
       
        // #17 Convertir un texto a mayúsculas
        String texto4 = "chinpandolfo";
        System.out.println("#17 Convertir un texto a mayúsculas \nEl texto \"" + texto4 + "\" en mayúsculas es: " + texto4.toUpperCase() + "\n");

        // #18 Convertir un texto a minúsculas
        String texto5 = "CHAPULIN COLORADO JAJA";
        System.out.println("#18 Convertir un texto a minúsculas \nEl texto \"" + texto5 + "\" en minúsculas es: " + texto5.toLowerCase() + "\n");

        // #19 Comparar dos textos
        String texto6 = "video juego";
        String texto7 = "Juego de mesa";
        System.out.println("#19 Comparar dos textos \nLos textos \"" + texto6 + "\" y \"" + texto7 + "\" son " + (texto6.equalsIgnoreCase(texto7) ? "iguales" : "diferentes") + "\n");

        // #20 Mostrar el primer carácter de una palabra
        String texto8 = "Progra II";
        System.out.println("#20 Mostrar el primer carácter de una palabra \nEl primer carácter del texto \"" + texto8 + "\" es: " + texto8.charAt(0) + "\n");

        // #21 Imprimir números del 1 al 10 con for
        System.out.println("#21 Imprimir números del 1 al 10 con for");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // #22 Imprimir números del 10 al 1
        System.out.println("#22 Imprimir números del 10 al 1 con for");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // #23 Imprimir números pares del 1 al 20
        System.out.println("#23 Imprimir números pares del 1 al 20 con for");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
       
        // #24 Imprimir números impares del 1 al 20
        System.out.println("#24 Imprimir números impares del 1 al 20 con for");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // #25 Sumar números del 1 al 5
        System.out.println("#25 Sumar números del 1 al 5");
        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            suma += i;
        }
        System.out.println("La suma de los números del 1 al 5 es: " + suma);

        // #26 Contar de 1 a 5 con while.
        System.out.println("#26 Contar de 1 a 5 con while.");
        int contador = 1;
        while (contador <= 5) {
            System.out.print(contador + " ");
            contador++;
        }
        System.out.println("\n");

        // 27 Repetir un mensaje 5 veces.
        System.out.println("#27 Repetir un mensaje 5 veces.");
        int repeticiones = 0;
        while (repeticiones < 5) {
            System.out.println("Esta es la repetición número " + (repeticiones + 1) + "\n");
            repeticiones++;
        }

        // #28 Imprimir una tabla del 1 al 5.
        System.out.println("#28 Imprimir una tabla del 1 al 5.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " x 1 = " + i);
        }

        // #29 Mostrar cuadrados del 1 al 5
        System.out.println("#29 Mostrar cuadrados del 1 al 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println("El cuadrado de " + i + " es: " + (i * i));
        }

        // #30 Mostrar cubos del 1 al 5.
        System.out.println("\n#30 Mostrar cubos del 1 al 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println("El cubo de " + i + " es: " + (i * i * i));
        }

        //31 Pedir un número y mostrarlo.
        System.out.println("\n#31 Pedir un número y mostrarlo.");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();
        System.out.println("El número ingresado es: " + numero + "\n");
        scanner.close();

        // #32 Pedir dos números y sumarlos.
        System.out.println("\n#32 Pedir dos números y sumarlos.");
        java.util.Scanner scanner2 = new java.util.Scanner(System.in);
        System.out.print("Por favor, ingresa el primer número: ");
        int numero1 = scanner2.nextInt();
        System.out.print("Por favor, ingresa el segundo número: ");
        int numero2 = scanner2.nextInt();
        int suma1 = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma1 + "\n");
        scanner2.close();

        // #33 Pedir nombre y edad, mostrar mensaje.
        System.out.println("\n#33 Pedir nombre y edad, mostrar mensaje.");
        java.util.Scanner scanner3 = new java.util.Scanner(System.in);
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre1 = scanner3.nextLine();
        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner3.nextInt();
        System.out.println("Hola " + nombre1 + ", tienes " + edad + " años.");
        scanner3.close();

        // #34 Pedir número y mostrar su doble.
        System.out.println("\n#34 Pedir número y mostrar su doble.");
        java.util.Scanner scanner4 = new java.util.Scanner(System.in);
        System.out.print("Por favor, ingresa un número: ");
        int numero3 = scanner4.nextInt();
        System.out.println("El doble de " + numero3 + " es: " + (numero3 * 2));
        scanner4.close();

        // #35 Pedir número y mostrar su triple
        System.out.println("\n#35 Pedir número y mostrar su triple.");
        java.util.Scanner scanner5 = new java.util.Scanner(System.in);
        System.out.print("Por favor, ingresa un número: ");
        int numero4 = scanner5.nextInt();
        System.out.println("El triple de " + numero4 + " es: " + (numero4 * 3));
        scanner5.close();

        // #36 Pedir número y mostrar su mitad.
        System.out.println("\n#36 Pedir número y mostrar su mitad.");
        java.util.Scanner scanner6 = new java.util.Scanner(System.in);
        System.out.print("Por favor, ingresa un número: ");
        int numero5 = scanner6.nextInt();
        System.out.println("La mitad de " + numero5 + " es: " + (numero5 / 2));
        scanner6.close();

        // #37 Pedir palabra y mostrarla 3 veces.
        System.out.println("\n#37 Pedir palabra y mostrarla 3 veces.");
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = entrada.nextLine();

        for (int i = 1; i <= 3; i++) {
            System.out.println(palabra);
        }

        entrada.close();
    
        // #38 Pedir número y mostrar si es mayor a 10
        System.out.println("\n#38 Pedir número y mostrar si es mayor a 10");

        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero6 = entrada2.nextInt();
        if (numero6 > 10) {
            System.out.println("El número es mayor a 10");
        } else {
            System.out.println("El número no es mayor a 10");
        }
        entrada2.close();

        // #39 Pedir número y mostrar si es menor a 0
        System.out.println("\n#39 Pedir número y mostrar si es menor a 0");

        Scanner entrada3 = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero7 = entrada3.nextInt();
        if (numero7 < 0) {
            System.out.println("El número es menor a 0");
        } else {
            System.out.println("El número no es menor a 0");
        }
        entrada3.close();

        // #40 Pedir texto y mostrar su longitud.
        System.out.println("\n#40 Pedir texto y mostrar su longitud");
        
        Scanner entrada4 = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = entrada4.nextLine();
        System.out.println("La longitud del texto es: " + texto.length());
        entrada4.close();


    }

}