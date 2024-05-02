package Clases_Abstractas.Factura;

public abstract class Factura {
    
    //Atributos
    private int nfactura;
    private int importe;
    private int iva;
    private String detalle;
    private int totalFinal;
   
    //Constructor
    public Factura(int nfactura, int importe, int iva, String detalle, int totalFinal) {
        this.nfactura = nfactura;
        this.importe = importe;
        this.iva = iva;
        this.detalle = detalle;
        this.totalFinal = totalFinal;
    }

     
}
