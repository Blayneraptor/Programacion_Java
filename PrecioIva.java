import java.util.Scanner;

public class PrecioIva {
    
    public static void main(String[] args) {
        
        double importe,iva,precio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el importe del artículo:");
        importe = sc.nextDouble();

        
        iva=importe*0.21;
        precio=iva+importe;

        System.out.println("El precio total añadiendo el IVA sería: " + precio);
        sc.close();




    }


}
