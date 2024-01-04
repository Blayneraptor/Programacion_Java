public class ifContador {
    public static void main(String[] args) {

        
        for (int i = 0; i <= 99999; i++) {
            String contador = String.format("%05d", i);
            String contadorSustituido = contador.replace("3", "E");
            System.out.println(contadorSustituido);
        }
    }
}
