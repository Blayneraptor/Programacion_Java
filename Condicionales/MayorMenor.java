package Condicionales;
import java.util.Scanner;

public class MayorMenor {
 
    public static void main(String[] args) {
        
        int num1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe un número: ");
        num1=sc.nextInt();

        if (num1>0){
            System.out.println("El número introducido es mayor que 0.");
        } else if (num1<0){

            System.out.println("El número introducido es menor que 0.");
        } else {

            System.out.println("El número es 0.");
        }

        sc.close();

    }


}


