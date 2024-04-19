package Polimorfismos.Polimorfismo_Asignación;
class Animal {
    public void hacerSonido() {
        System.out.println("Sonido de animal");
    }
}

class Perro extends Animal {
    public void hacerSonido() {
        System.out.println("Guau");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        Animal miAnimal = new Perro(); // Asignación de un objeto de tipo Perro a una referencia de tipo Animal
        miAnimal.hacerSonido(); // Salida: Guau
    }
}
