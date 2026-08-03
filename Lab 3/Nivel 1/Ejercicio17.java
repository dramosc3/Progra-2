// 17 - Manejar error al acceder a charAt

public class Ejercicio17 {

    public void obtenerCaracter(String texto, int posicion) {

        try {

            char letra = texto.charAt(posicion);

            System.out.println("Caracter encontrado: " + letra);

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("Error: La posicion esta fuera del rango del texto.");

        }

    }

}