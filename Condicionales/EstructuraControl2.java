package Condicionales;
import java.util.Scanner;

public class EstructuraControl2 {
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        int num1;
        System.out.println("Escribe un número");
        num1 = sc.nextInt();

        if (num1 %2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        sc.close();
    }
}
