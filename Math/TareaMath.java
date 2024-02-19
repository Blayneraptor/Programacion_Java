package Math;
import java.util.Scanner;

public class TareaMath {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número que corresponda a la longitud del radio de una esfera");
        double radio=sc.nextDouble();
        double volumen=(4.0/3.0)*Math.PI*(Math.pow(radio, 3));

        System.out.printf("El volumen de la esfera con ese radio sería: %.3f%n", volumen);
        sc.close();


    }
}