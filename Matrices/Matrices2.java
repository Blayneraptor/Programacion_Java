import java.util.Scanner;
import java.util.Random;

public class Matrices2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        System.out.println("Introduce el número de columnas: ");
        int columnas = scanner.nextInt();

        
        int[][] matriz = new int[5][columnas];

        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(11); 
            }
        }

        
        System.out.println("Matriz generada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}

