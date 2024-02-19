package Bucles;
import java.util.Scanner;

public class ImprimirNumeros {
    
    public static void main(String[] args) {
         
        Scanner sc= new Scanner(System.in);

        for (int i=0;i<=50;i+=5){
            
            System.out.println(i);

        }
        sc.close();
    }
}
