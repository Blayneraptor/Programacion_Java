import java.util.Scanner;

public class IfParoImpar {
    

    public static void main(String[] args) {
        
        int num1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un número");
        num1 =sc.nextInt();

        if (num1>0) {
            System.out.println("El número " + num1 + " es positivo");
        } else {
            System.out.println("El número " + num1 + " es negativo");
        }
        sc.close();
    }
}
