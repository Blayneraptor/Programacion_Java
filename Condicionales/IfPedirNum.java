package Condicionales;
import java.util.Scanner;

public class IfPedirNum {
    
    public static void main(String[] args) {
        
         int num1,num2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce dos números");
        num1 =sc.nextInt();
        num2 =sc.nextInt();

        if (num1>num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1==num2){
            System.out.println(num1 + " es igual que " + num2);
        } else {
            System.out.println(num1 + " es menor que " + num2);
        }
        sc.close();
    }
}
