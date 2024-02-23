import java.util.Scanner;
import java.util.Random;

public class Matrices2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicitar al usuario el número de columnas
        System.out.println("Introduce el número de columnas:");
        int columnas = sc.nextInt();
        
        // Declarar la matriz de 5 filas y n columnas
        int[][] matriz = new int[5][columnas];
        
        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();
        
        // Rellenar la matriz con números aleatorios entre 0 y 10
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(11); // Genera números entre 0 y 10
            }
        }
        
        // Imprimir la matriz
        System.out.println("Matriz generada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea para imprimir la siguiente fila
        }
    }
}
