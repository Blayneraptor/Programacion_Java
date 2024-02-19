package Condicionales;
import java.util.Scanner;

public class IfPedirTres {
    
    public static void main(String[] args) {
            

         int num1,num2,num3;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce tres números");
        num1 =sc.nextInt();
        num2 =sc.nextInt();
        num3 =sc.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println(num1+ " es mayor que " + num2 + " y " + num3 );
            
        } else if (num2>num1 && num2>num3) {
            System.out.println(num2+ " es mayor que " + num1 + " y " + num3 );
        }
         else {
            System.out.println(num1+ " es menor que " + num2 + " y " + num3 );
        }

        sc.close();
    }
}

