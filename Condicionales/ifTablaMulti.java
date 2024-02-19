package Condicionales;

public class ifTablaMulti {
    
    public static void main(String[] args) {
        
        for (int i=1;i<=10;i++){
            System.out.println("Tabla de multiplicar del " + i + ":");

            for (int a = 1; a <= 10; a++){
            int resultado=i*a;
            System.out.println(i + " por " + a + " es igual a : " + resultado);
            }
            System.out.println();
            }
            
        }
    }



