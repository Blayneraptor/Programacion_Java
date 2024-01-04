import java.util.Scanner;

public class ifAlturaAlumnos {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] edades = new int[5];
        double[] alturas = new double[5];

        int cantidadmas18=0;
        int alturamas175=0;
        double mediaedades=0;
        double medialturas=0;

        for (int i=0;i<5;i++){
            System.out.println("Introduce la edad del alumno " + (i+1));
            edades[i]=sc.nextInt();
            mediaedades+=edades[i]; 
        }
        for (int i=0;i<5;i++){
            System.out.println("Introduce la altura del alumno " + (i+1));
            alturas[i]=sc.nextDouble();
            medialturas+=alturas[i];
        }
        for (int i=0;i<5;i++){
            System.out.println("Alumno " + (i+1) + " edad " + edades[i] + " con una altura de " + alturas[i] + " metros"  );

        if (edades[i]>=18){
            cantidadmas18++;
            
         }
        if (alturas[i]>=1.75){
            alturamas175++;
         }  
         
        }sc.close();
         System.out.println("La altura media de los alumnos es: " + medialturas/5 + " metros");
         System.out.println("La edad media de los alumnos es: " + mediaedades/5 + " años");
         System.out.println("La cantidad de alumnos mayores de 18 es: " + cantidadmas18);
         System.out.println("La cantidad de alumnos con una altura de mas de 1,75m es: " + alturamas175);
        }
}

