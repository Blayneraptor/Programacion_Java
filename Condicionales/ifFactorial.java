package Condicionales;
import java.util.Scanner;

public class ifFactorial {

    public static void main(String[] args) {
        
        int factorial=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para decir su factorial");
        int num1=sc.nextInt();
        
        for (int i=1;i<=num1;i++){
        factorial*=i;
        }   
        System.out.println(factorial);
        sc.close();
    }
}
