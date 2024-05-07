public class Empleado extends Persona {
    
    //Atributos
    private double sueldo;
    private double comision;

    

    public Empleado(String nombre, String apellidos, int edad,double sueldo,double comision){
        super(nombre,apellidos,edad);
        this.sueldo=sueldo;
        this.comision=comision;
        
    }

    //Métodos

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
}
