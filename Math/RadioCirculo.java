package Math;
import java.util.Scanner;
public class RadioCirculo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el radio del círculo: ");
        double radio=sc.nextDouble();
        double resultado=Math.PI*Math.pow(radio, 2);

            System.out.println("El resultado de su área es: " + Math.round(resultado));

        sc.close();
    }




}