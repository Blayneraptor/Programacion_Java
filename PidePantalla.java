import java.util.Scanner;

public class PidePantalla{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nombre;
        int num1;
        int i=0;
        System.out.println("Escribe tu nombre");
        nombre=sc.next();
        System.out.println("¿Cuántas veces quieres que se imprima?");
        num1=sc.nextInt();

        for (i=0;i<num1;i++){
            System.out.println(nombre);

        sc.close();
        }



        }



    }


