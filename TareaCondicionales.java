import java.util.Scanner;

public class TareaCondicionales {
    
    public static void main(String[] args) {
        
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número");
        num1=sc.nextInt();
        System.out.println("Escribe otro número");
        num2=sc.nextInt();
        System.out.println("Escribe otro número");
        num3=sc.nextInt();

        
        if (num1 > num2 && num1 > num3 ) {
        System.out.println("El número 1 es mayor que todos");
        } else if (num2 > num1 && num2 > num3 ){
        System.out.println("El número 2 es mayor que todos");
        } else if (num3 > num1 && num3 > num2 ){
        System.out.println("El número 3 es mayor que todos");
        } else {}

        if (num1 < num2 && num1 < num3 ) {
        System.out.println("El número 1 es menor que todos");
        } else if (num2 < num1 && num2 < num3 ){
        System.out.println("El número 2 es menor que todos");
        } else if (num3 < num1 && num3 < num2 ){
        System.out.println("El número 3 es menor que todos");
        }
        sc.close();

    }
}
