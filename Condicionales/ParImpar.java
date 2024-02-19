package Condicionales;
import java.util.Scanner;

public class ParImpar {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int num1=0;
        System.out.println("Escribe un numero");
        num1=sc.nextInt();
        while (num1!=0){
        if (num1==0)  {
            break;
        } else if (num1%2==0){
            System.out.println("Es un número par");    
        } else {
            System.out.println("Es un número impar");
        } 
        System.out.println("Escribe otro número");
        num1=sc.nextInt();
        }     
        sc.close();

    }


}
