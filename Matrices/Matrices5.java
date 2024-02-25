import java.util.ArrayList;
import java.util.Collections;


public class Matrices5 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            numeros.add(i);
        }

        Collections.shuffle(numeros);

        int[][] matriz = new int[3][3];
        int indice = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = numeros.get(indice++);
            }
        }

        System.out.println("Matriz generada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
