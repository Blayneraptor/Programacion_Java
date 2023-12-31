import java.util.Scanner;

public class ifPedirNota {
    
    public static void main(String[] args) {
        
        int num1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce una nota");
        num1 =sc.nextInt();

        if (num1<5) {
            System.out.println("Has sacado un insuficiente.");
         } else if (num1>=5 && num1<7){
            System.out.println("Has sacado un suficiente");

         }  else if (num1>=7 && num1<=9){
            System.out.println("Has sacado un notable");
        
         }  else if (num1>9){
            System.out.println("Has sacado un sobresaliente");
        
         }
         sc.close();

    }
}
