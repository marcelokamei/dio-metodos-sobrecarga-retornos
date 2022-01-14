package dio.me.retornos;

public class Main {
    public static void main(String[] args) {

        //quadrilatero
        System.out.println("Retornos");
        double areaQuadrado = Quadrilatero.area(9);
        System.out.println("Área do quadrado: "+areaQuadrado);

        double areaRetangulo = Quadrilatero.area(9,7);
        System.out.println("Área do Retângulo: "+ areaRetangulo);

        double areaTrapezio = Quadrilatero.area(9,8,12);
        System.out.println("Área do trapézio: "+areaTrapezio);

    }
}
