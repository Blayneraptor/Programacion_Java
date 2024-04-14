public class ArticuloAnime {

    // Atributos

    private String nombre;
    public int precio;
    private String descripcion;

    // Constructor

    public ArticuloAnime(String nombre,int precio,String descripcion){
        this.nombre=nombre;
        this.precio=precio;
        this.descripcion=descripcion;

    }

    public String getDescripcion(){
        return "Nombre: " + nombre + ", Precio:" + precio + ", Descripción " + descripcion;
    }
}
