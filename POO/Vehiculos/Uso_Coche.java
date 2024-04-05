package POO.Vehiculos;


public class Uso_Coche {
    
    public static void main(String[] args) {
        
        Coche micoche= new Coche();

        micoche.setColor("marrón");

        System.out.println(micoche.getDatosGenerales());

        System.out.println(micoche.getColor());


    }

}
