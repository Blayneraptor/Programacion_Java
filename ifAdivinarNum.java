import java.util.Random;
import java.util.Scanner;

public class ifAdivinarNum {
    public static void main(String[] args) {
        
        int numsecreto,num1;
        Scanner sc= new Scanner(System.in);
        Random rd = new Random();
        numsecreto = rd.nextInt(100);
        System.out.println("Adivina el número del 1 al 100");
        do {
            System.out.println("Introduce un número");
            num1=sc.nextInt();
            if (num1==numsecreto) {
                System.out.println("¡Has acertado!");
            } else if (num1>numsecreto){
                System.out.println("!Más bajo¡");
            } else {
                System.out.println("¡Más alto!");
            }

        } while (num1!=numsecreto);
        sc.close();

    }
}
