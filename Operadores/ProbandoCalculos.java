package Operadores;
public class ProbandoCalculos {
    public static void main(String[] args) {
        // Llamada a la función e impresión del resultado
        int suma = sumar(5, 3);
        System.out.println("La suma es: " + suma);

        // Llamada a otra función e impresión del resultado
        String saludo = obtenerSaludo("Juan");
        System.out.println(saludo);
    }

    // Definición de una función para sumar dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    //Definición de otra función para obtener un saludo personalizado
    public static String obtenerSaludo(String nombre) {
        return "Hola, " + nombre + "!";
    }
}