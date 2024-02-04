import java.util.Scanner;

public class prueba2 {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un puto numero");
        int numero=sc.nextInt();

        switch (numero) {
            case 1:
            System.out.println("Hola");
                break;
            case 2:
            System.out.println("Puta");
            break;
            default:
            System.out.println("olaol");
                break;
        }
        sc.close();

    }



}

