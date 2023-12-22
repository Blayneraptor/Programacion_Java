public class TareaBucle3 {

    public static void main(String[] args) {
     

       System.out.println("El factorial del número 15 es:");
       long resultado=1;
       int num1=15;
       
       for (int i=1;i<=num1;i++){
        resultado*=i;
       }
       System.out.println(resultado);

    }
}