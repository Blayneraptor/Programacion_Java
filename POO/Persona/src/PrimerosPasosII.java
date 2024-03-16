

public class PrimerosPasosII {
    public static void main(String[] args)  {

    //Creamos un objeto del tipo Direccion

    Direccion midomicilio = new Direccion();
    
    //Accedemos a la propiedad
    midomicilio.calle="Atocha";
    midomicilio.codigopostal=29400;
    midomicilio.numero=41;
    midomicilio.piso=2;
    midomicilio.provincia="Madrid";

    midomicilio.imprimir();


    //Creamos otro objeto

    Direccion midomicilio2= new Direccion();
    midomicilio2.calle="Delicias";
    midomicilio2.codigopostal=28024;
    midomicilio2.numero=20;
    midomicilio2.piso=1;
    midomicilio2.provincia="Madrid";

    midomicilio2.imprimir();

    }
}
