import java.util.Scanner;

public class PidePantallaNeg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;

        do {
            System.out.println("Introduce un número (introduce un número negativo para finalizar):");
            numero = sc.nextInt();

            if (numero >= 0) {
                suma += numero;
            }

        } while (numero >= 0);

        System.out.println("La suma de los números introducidos es: " + suma);

        sc.close();
    }
}
