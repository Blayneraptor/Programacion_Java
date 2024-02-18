import java.util.Scanner;

public class Array2 {
    
    public static void main(String[] args) {
        


        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el número de posiciones que tendrá el array");
        int numero=sc.nextInt();
        int lista[]=new int[numero];

        for (int i=0;i<lista.length;i++){
            System.out.println("Introduce el número para la posición " + (i+1));
            lista[i]=sc.nextInt();

        }
        
        
        System.out.println("Introduce un número de posiciones para el array 2");
        int numero2=sc.nextInt();
        int lista2[]= new int[numero2];

        for (int i=0; i<lista2.length;i++){
            System.out.println("Introduce el número para la posición " + (i+1));
            lista2[i]=sc.nextInt();

        }

        
       int[] array3 = new int[lista2.length + lista.length];

       for (int i = 0; i < lista.length; i++) {
           array3[i] = lista[i];
       }

       for (int i = 0; i < lista2.length; i++) {
           array3[lista.length + i] = lista2[i];
       }

       System.out.println("El tercer array que contiene los datos de los dos primeros arrays es:");
       for (int i = 0; i < array3.length; i++) {
           System.out.println("Posición " + (i + 1) + ": " + array3[i]);
       }

       sc.close();
   }
}