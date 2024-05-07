public class Persona {

    // Atributos

    private String nombre;
    private String apellidos;
    private int edad;

    // Constructor

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Getters
    public String getNombre() {
        return "Nombre:" + nombre;
    }

    public String getApellidos() {
        return "Apellidos:" + apellidos;
    }

    public String getEdad() {
        return "Edad:" + edad;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
