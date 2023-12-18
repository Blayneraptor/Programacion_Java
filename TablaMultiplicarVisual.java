  import java.util.Scanner;

public class TablaMultiplicarVisual {
    

    public static void main(String[] args) {
      
        Scanner sc= new Scanner(System.in);
        int num1;
        int i=1;
        int resultado=0;

        System.out.println("Escribe un número entero desde el 1 al 12:");
        num1=sc.nextInt();

        while (i<=10){
            resultado=num1*i;
            System.out.println(num1 + " x " + i + " = " + resultado);
            i++;
        }


        sc.close();







    }
}
