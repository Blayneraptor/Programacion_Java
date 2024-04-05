package POO.Vehiculos;


//Atributos

public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;

    // Constructor

    public Coche() {

        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;

    }

    //Getters

    public String getLargo(){
        
        return "El largo del coche es " + largo;

    }


}
