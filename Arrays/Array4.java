package Arrays;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int lista[]=new int[58];
        int numeroceldaspar=0;
        int numeroceldasimpar=0;
        for (int i=1;i<lista.length;i++){
            lista[i]=i;
            if (lista[i]%2==0){
                System.out.println("El número " + lista[i] + " es par");
                
                numeroceldaspar++;
            } else {
                System.out.println("El número " + lista[i] + " es impar");
                
                numeroceldasimpar++;
            }
            
        }sc.close();
          
        System.out.println("El número de celdas pares es " + numeroceldaspar);
        System.out.println("El número de celdas impares es " + numeroceldasimpar);

    }
}
