public class Empleado extends Persona {
    
    //Atributos
    private double sueldo;
    private double comision;

    

    public Empleado(String nombre, String apellidos, int edad,double sueldo,double comision){
        super(nombre,apellidos,edad);
        this.sueldo=sueldo;
        this.comision=comision;
        
    }

    //Setters y Getters

    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }

    public void setComision(double comision){
        this.comision=comision;
    }

    public double getSueldo(){
        return sueldo;
    }
    public double getComision() {
        return comision;
    }

    //Metodos

    public double getTotalCobrado(){
        if (sueldo > 0 && comision > 0){
            return sueldo+comision;
        }
        return 0;
    }
}
