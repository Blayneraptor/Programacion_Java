import java.util.Scanner;

public class CosteLlamada {

    public static void main(String[] args) {
        double minutos,euros;
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe los minutos que has estado en llamada:");
        minutos=sc.nextDouble();

        euros=minutos*0.34;

        System.out.println("El coste de la llamada sería: " + euros + " euros.");
    sc.close(); 



    }
    
}
