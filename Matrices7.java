import java.util.Scanner;

public class Matrices7 {

    /*Diseña un programa en Java que pide por pantalla una palabra de x caracteres. Se
    debe crear una matriz con el mismo número de celdas que letras tiene la palabra.
    Consideraciones:
• Cada letra se debe almacenar en una celda.
• Se debe comprobar si hay algún valor repetido en alguna celda. */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una palabra para crear una matriz con su longitud: ");
        String palabra=sc.nextLine();
            char matriz[]= new char[palabra.length()];

            for (int i=0;i<palabra.length();i++){
                matriz[i]=palabra.charAt(i);
                System.out.print((matriz[i]));
                System.out.print(" ");
            }sc.close();
        
        

    }
}
