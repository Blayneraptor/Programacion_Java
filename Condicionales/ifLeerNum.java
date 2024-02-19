package Condicionales;
import java.util.Scanner;

public class ifLeerNum {
    
    public static void main(String[] args) {
        
        int num1;
        Scanner sc= new Scanner(System.in);
        do {

            System.out.println("Introduce un número.(Introduce 0 para terminar)");
            num1 =sc.nextInt();

          if (num1>0){
            System.out.println("El número es positivo");
        } else if (num1<0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("Has terminado");
        }

        }  while (num1!=0) ;
        sc.close();
    
    }
}
