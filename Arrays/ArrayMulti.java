package Arrays;
public class ArrayMulti {
    public static void main(String[] args) {
        
        //Como hacer un array tridimensional

        String lista[][][]= new String[3][3][3];

        for (int i=0;i<3;i++){
            
            for (int j=0;j<3;j++){
                
                for (int c=0;c<3;c++){
                    lista[i][j][c]="Fila " + i + " Columna cero " + j + " Columna uno " + c ;
                    System.out.println(lista[i][j][c]);
                }
                
            }
            System.out.println("Fin de fila " + i + " -------------------------");
        }


    }
}