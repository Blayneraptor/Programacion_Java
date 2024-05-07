public class MainHerencia {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Jose", "Couso", 30);
        Persona persona2 = new Persona("Javier", "López", 32);
        Persona persona3 = new Persona("Laura", "García", 23);
        Persona persona4 = new Persona("Inma", "Pérez", 43);

        Empleado empleado1= new Empleado("Jose", "Couso", 30,2000,250);
        Empleado empleado2= new Empleado("Javier", "López", 32,2300,150);
        Empleado empleado3= new Empleado("Laura", "García", 23,1900,300);
        Empleado empleado4= new Empleado("Inma", "Pérez", 43,1400,500);
        Empleado empleado5= new Empleado("Jaime", "Manos", 41,3000,100);

        String nombrePersona1 = persona1.getNombre();
        String apellidoPersona1 = persona1.getApellido();
        int edadPersona1 = persona1.getEdad();
        System.out.println("Persona 1: Nombre: " + nombrePersona1 + ", Apellido: " + apellidoPersona1 + ", Edad: " + edadPersona1);

        // Obtener y mostrar información del empleado1
        double totalCobradoEmpleado1 = empleado1.getTotalCobrado();
        System.out.println("Empleado 1: Total Cobrado: " + totalCobradoEmpleado1);
    }
    
}
