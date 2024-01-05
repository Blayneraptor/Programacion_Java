import java.util.Scanner;

public class TareaBucle2 {

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int num1=0;
      int num2=1;
      int resultado;
    
      int i;
      System.out.println("Te muestro los 10 primeros números de la serie de Fibonnaci");
       
        for (i=1;i<=10;i++){
            
            resultado=num1+num2;
            num1=num2;
            num2=resultado;
            
            System.out.println(resultado);
            sc.close();
        }
        
       
    }
}


