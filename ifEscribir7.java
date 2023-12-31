import java.util.Scanner;

public class ifEscribir7 {
    public static void main(String[] args) {
        
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Aquí tienes los numeros del 100 al 0, de 7 en 7");
         for (int i=100;i>=0;i-=7){
        System.out.println(i);
         }
         sc.close();
    }
}
