public class Vehiculo {

    // Propiedades

    private int matricula;
    private String marca;
    private String modelo;
    private String color;
    private int Numpuertas;
    private double potencia;

    // Constructor

    public Vehiculo(int matricula, String marca, String modelo, String color, int Numpuertas, double potencia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.Numpuertas = Numpuertas;
        this.potencia = potencia;

        //Métodos

    public getDatos(){
        return "Matrícula: " + matricula + "n\ Marca: " + marca + "n\ Modelo: " + modelo + "n\ Color: " + color + "n\ Puertas: " + puertas + "n\ Potencia: " + potencia;

    }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumpuertas() {
        return Numpuertas;
    }

    public void setNumpuertas(int numpuertas) {
        Numpuertas = numpuertas;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
}
