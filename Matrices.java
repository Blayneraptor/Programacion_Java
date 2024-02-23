    public class Matrices {
    public static void main(String[] args) {
        int[][] matriz = {
                {3, 4, 5, 7, 8},
                {0, 0, 0, 0},
                {1, 1, 1, 1},
                {6, 6, 6, -1}
        };

        int mayor = matriz[0][0];
        int menor = matriz[0][0];
        for (int[] fila : matriz) {
            for (int num : fila) {
                if (num > mayor) {
                    mayor = num;
                }   
                if (num < menor) {
                    menor = num;
                }
            }
        }
        System.out.println("El mayor valor de la matriz es: " + mayor);
        System.out.println("El menor valor de la matriz es: " + menor);

        
        System.out.println("Valores de la primera fila:");
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print(matriz[0][i] + " ");
        }
        System.out.println(); 

       
        System.out.println("Valores de la última fila:");
        int ultimaFila = matriz.length - 1; 
        for (int i = 0; i < matriz[ultimaFila].length; i++) {
            System.out.print(matriz[ultimaFila][i] + " ");
        }

    }
}