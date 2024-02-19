public class Array1 {

    public static void main(String[] args) {
       
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

       
        System.out.println("Array en sentido inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
            
        }
    }
}
