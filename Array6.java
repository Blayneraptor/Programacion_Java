import java.util.Scanner;

public class Array6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Introduce el número de celdas de la tabla o array:");
        int longitud = sc.nextInt();

      
        int[] tabla = new int[longitud];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = i + 1;
        }

        System.out.println("Imprimir la tabla con un bucle for:");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i] + " ");
        }
        System.out.println(); 

        System.out.println("Imprimir la tabla con un bucle while:");
        int j = 0;
        while (j < tabla.length) {
            System.out.print(tabla[j] + " ");
            j++;
        }
        System.out.println(); 

        System.out.println("Imprimir la tabla visualmente:");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("| " + tabla[i] + " ");
        } sc.close();
        System.out.println("|"); }
}
