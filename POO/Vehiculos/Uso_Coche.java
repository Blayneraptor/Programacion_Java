package POO.Vehiculos;


public class Uso_Coche {
    
    public static void main(String[] args) {
        
        Coche micoche= new Coche();

        micoche.setColor("marrón");

        System.out.println(micoche.getDatosGenerales());

        System.out.println(micoche.getColor());

        micoche.setAsientos("si");

        System.out.println(micoche.getAsientos());

        micoche.setClimatizador("si");
        System.out.println(micoche.getClimatizador());

        System.out.println(micoche.getPesoCoche());
        
        System.out.println("El precio final del coche es : " + micoche.getPrecioCoche());
    }

}
