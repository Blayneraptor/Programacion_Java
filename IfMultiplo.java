import java.util.Scanner;

public class IfMultiplo {
    
    public static void main(String[] args) {
        
         int num1,num2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce dos números");
        num1 =sc.nextInt();
        num2 =sc.nextInt();

        if (num1 % num2 ==0) {
            System.out.println(num1 + " es multiplo de " + num2);
        } else {
            System.out.println(num1 + " no es multiplo de " + num2);
        }
        sc.close();
    }
}