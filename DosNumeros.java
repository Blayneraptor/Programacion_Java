import java.util.Scanner;

public class DosNumeros {
    
    public static void main(String[] args) {
    
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe un número: ");
        a=sc.nextInt();
        System.out.println("Escribe un segundo número: ");
        b=sc.nextInt();

        if (a>b){
            a=a*2;
            b=b/2;
        System.out.println("El número mayor se multiplica por dos y sale: " + a + ". Al número menor se le divide entre dos y sale: " + b);
        } else{
            a=a/2;
            b=b*2;
        System.out.println("El número mayor se multiplica por dos y sale: " + b + ". Al número menor se le divide entre dos y sale: " + a);
        }
        sc.close();
    }
}
