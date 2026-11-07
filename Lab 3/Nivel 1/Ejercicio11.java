// 11 - Leer arreglo y capturar indice fuera de rango

public class Ejercicio11 {

    public void mostrarElemento(int[] numeros, int indice) {

        try {

            System.out.println("Elemento encontrado: " + numeros[indice]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: El indice ingresado esta fuera del rango del arreglo.");

        }

    }

}