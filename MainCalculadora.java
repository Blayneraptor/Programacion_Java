public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        // Uso de diferentes versiones del método sumar
        int sumaEnteros = calc.sumar(5, 3);
        double sumaDecimales = calc.sumar(2.5, 3.5);
        String concatenacion = calc.sumar("Hola ", "Mundo");
        int sumaTresEnteros = calc.sumar(2, 3, 5);
        
        System.out.println("Suma de enteros: " + sumaEnteros); // Salida: Suma de enteros: 8
        System.out.println("Suma de decimales: " + sumaDecimales); // Salida: Suma de decimales: 6.0
        System.out.println("Concatenación de cadenas: " + concatenacion); // Salida: Concatenación de cadenas: Hola Mundo
        System.out.println("Suma de tres enteros: " + sumaTresEnteros); // Salida: Suma de tres enteros: 10
    }
}