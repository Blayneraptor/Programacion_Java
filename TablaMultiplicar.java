import java.util.Scanner;

public class TablaMultiplicar {
    

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int num1;
        int i;
        int resultado;

        System.out.println("Escribe un número entero desde el 1 al 12:");
        num1=sc.nextInt();

        for (i=1;i<10;i++){
            resultado=num1*i;
            System.out.println(num1+ " x " + i + " = " + resultado);

        sc.close();
        }

        












    }
}
