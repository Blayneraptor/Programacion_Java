import java.util.Scanner;

public class ifNotas {
    
    public static void main(String[] args) {
        
        double[] notas = new double[6];
        int aprobados=0;
        int suspensos=0;
        int condicionados=0;
        Scanner sc= new Scanner(System.in);

        for (int i=0;i<6;i++){
            System.out.println("Introduce la nota del alumno " + (i+1));
            notas[i]=sc.nextDouble();
            if (notas[i]>=5) {
            aprobados++;
            } else if (notas[i]<4){
            suspensos++;
            } else {
            condicionados++;
            }
        }
        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos suspensos: " + suspensos);
        System.out.println("Alumnos condicionados: " + condicionados);
        sc.close();
    }
}
