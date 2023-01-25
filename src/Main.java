public class Main {
    public static void main(String[] args) {

        //Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(6,5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(6,4,8);
        System.out.println("Área do trapezio: " + areaTrapezio);

    }
}