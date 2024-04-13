import java.util.*;

public class Vector {

    public void getVectorDerecho() {
        Random random = new Random();
        int[] vector = new int[10];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(10);
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

    }

    public void getVectorDelreves() {

    }

}
