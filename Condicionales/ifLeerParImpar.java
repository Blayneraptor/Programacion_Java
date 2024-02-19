package Condicionales;
import java.util.Scanner;

public class ifLeerParImpar {
    
    public static void main(String[] args) {

        int num1;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("Introduce un número.(Introduce 0 para terminar)");
            num1 = sc.nextInt();
            if (num1==0) {
            System.out.println("Has terminado.");
        }   else if (num1 %2 ==0){
            System.out.println("El número es par.");
        }   else {
            System.out.println("El número es impar.");
        }

        } while (num1!=0);
        sc.close();




    }
}
