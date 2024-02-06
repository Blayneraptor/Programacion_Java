import java.util.Random;
import java.util.Scanner;

public class GenerarAleatorios {
    public static void main(String[] args) {
    
        
        Scanner sc = new Scanner(System.in);
        Random rand=new Random();
        System.out.println("¿Cuantos números aleatorios quieres mostrar?");
        int numero=sc.nextInt();
        

        for (int i=1;i<=numero;i++){
            int numerosrandom=rand.nextInt(100);

            System.out.println("Número random generado: " + numerosrandom);

        }
        sc.close();
    }
}
