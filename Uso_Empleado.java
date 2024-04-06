import java.util.*;


//En este ejercicio hacemos combinado el Uso_Empleado y la clase Empleado

public class Uso_Empleado {
    
    public static void main(String[] args) {
        


    }

}

class Empleado{

    //Creamos constructor
    public Empleado (String nombre, double sueldo, int anio, int mes, int dia){

        this.nombre=nombre;
        this.sueldo=sueldo;
        GregorianCalendar calendario= new GregorianCalendar(anio,mes-1,dia);
        altaContrato=calendario.getTime();

    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;

}
