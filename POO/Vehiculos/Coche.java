package POO.Vehiculos;


//Atributos

public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero,climatizador;

    // Constructor

    public Coche() {

        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;

    }

    //Getters

    public String getDatosGenerales(){

        return "La plataforma del vehículo tiene " + ruedas + " ruedas"
        + ". Mide " + largo/1000 + " metros con un ancho de " + ancho + " cm y un peso de plataforma de " +
        peso_plataforma  + " kg.";

    }

    public String getColor(){

        return "El color del coche es " + color;

    }

    //Setters

    public void setColor(String color_coche){

        color=color_coche;
        
    }


}
