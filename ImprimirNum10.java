import java.util.Scanner;

public class ImprimirNum10 {
    


    
    public static void main(String[] args) {
         
        Scanner sc= new Scanner(System.in);

        for (int i=100;i>=0;i-=10){
            
            System.out.println(i);

        }
        sc.close();
    }
}
