public class MainRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 10);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        rectangulo.setLongitud(8);
        rectangulo.setAncho(4);

        System.out.println("Nuevo área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Nuevo perímetro del rectángulo: " + rectangulo.calcularPerimetro());
    }
}