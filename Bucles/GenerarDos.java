package Bucles;
import java.util.Random;
import java.util.Scanner;

public class GenerarDos {
    public static void main(String[] args) {
        
    
        
        Scanner sc = new Scanner(System.in);
        Random rand=new Random();
        System.out.println("Introduce dos números para generar  5 numeros aleatorios entre ellos");
        int numero1=sc.nextInt();
        int numero2=sc.nextInt();
        

        for (int i=numero1;i<=numero2;i++){
            int numerosrandom=rand.nextInt(numero1,numero2);

            System.out.println("Números random generado: " + numerosrandom);

        }
        sc.close();
    }
}

    