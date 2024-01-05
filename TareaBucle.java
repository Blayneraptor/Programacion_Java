import java.util.Scanner;

public class TareaBucle {

      public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int num1;
        do{
        System.out.println("Introduce un número, introduce 0 para salir");
        num1=sc.nextInt();
        
        if (num1 > 0 ){
            boolean esPrimo =true;
            if (num1 <=1){
                esPrimo = false;
                
            } else {
                for (int i=2; i <=num1/2; i++){
                    if (num1 %i ==0){
                        esPrimo=false;
                        break;
                    }
                }
            }
            if (esPrimo){
                System.out.println(num1+ " es un número primo. ");
            } else {
                System.out.println(num1 + " no es un número primo.");
            }

        } else if (num1 <0){
            System.out.println(" por favor, introduce un número positivo.");
        } 

      } while (num1 !=0);
      System.out.println("Has salido.");
      sc.close();
      
    }
}
