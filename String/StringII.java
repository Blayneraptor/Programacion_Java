package String;
import java.util.Scanner;

public class StringII {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String email;

        System.out.println("Introduce un email electrónico con estas características: \n-Debe contener solo una @ \n-Tiene que tener un punto al final \n-Longitud mínima 20 caracteres \n-Apareceran en minuscula. ");

        do {
            System.out.print("Introduce el email:");
            email = sc.nextLine().toLowerCase();
        } while (!(email.contains("@") && email.indexOf("@") == email.lastIndexOf("@") && email.endsWith(".") && email.length() >= 20));

        System.out.println(email);
        System.out.println("Email guardado correctamente.");
        sc.close();

    }
}