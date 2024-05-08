import Polimorfismos.Polimorfismo_Inclusion.Vehiculo;

public class Deportivo extends Vehiculo{
    
    //Propiedades
    private boolean descapotable;

    public Deportivo(String matricula, String marca, String modelo, String color, int numPuertas, int potencia, boolean descapotable) {
        super(matricula, marca, modelo, color, numPuertas, potencia);
        this.descapotable = descapotable;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
}
