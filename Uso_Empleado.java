import java.util.*;

import javax.swing.JOptionPane;


//En este ejercicio hacemos combinado el Uso_Empleado y la clase Empleado

public class Uso_Empleado {
    
    public static void main(String[] args) {
        
        Empleado empleado1= new Empleado("Jose Couso", 50000, 1994, 1, 24);
        Empleado empleado2= new Empleado("Jose Perez", 40000, 1993, 2, 20);
        Empleado empleado3= new Empleado("Jose Maria", 80000, 1995, 5, 3);

        

    }

}

//<------------------------------------------------------------------------------------------>

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


    //Getters

    public String getNombre(){

        return nombre;
    }

    public double getSueldo(){

        return sueldo;
    }

    public Date getaltaContrato(){

        return altaContrato;
    }

    //Setters metodos

    public void setSubeSueldo(double porcentaje){

        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;

    }

}
