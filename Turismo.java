import Polimorfismos.Polimorfismo_Inclusion.Vehiculo;

public class Turismo extends Vehiculo {
    

    //Propiedades

    private int plazas;

    //Constructor

    public Turismo(int matricula, String marca, String modelo, String color, int Numpuertas, double potencia, int plazas) {
        super(matricula,marca,modelo,color,Numpuertas,potencia);
        this.plazas=plazas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
}
