package POO.Vehiculos;


//Atributos

public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    String color;
    int peso_total;
    boolean asientos_cuero,climatizador;

    // Constructor

    public Coche() {

        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;

    }

    //Getters

    public String getLargo(){

        return "El largo del coche es " + largo;

    }

    public String getColor(){

        return "El color del coche es " + color;

    }

    //Setters

    public void setColor(){

        color="azul";
    }


}
