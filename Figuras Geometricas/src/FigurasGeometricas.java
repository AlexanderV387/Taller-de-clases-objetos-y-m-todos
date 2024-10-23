import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FigurasGeometricas {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese la base del triángulo:");
        double baseTriangulo = Double.parseDouble(reader.readLine());
        System.out.println("Ingrese la altura del triángulo:");
        double alturaTriangulo = Double.parseDouble(reader.readLine());

        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        double perimetroTriangulo = baseTriangulo * 3;

        System.out.println("Área del triángulo: " + areaTriangulo);
        System.out.println("Perímetro del triángulo: " + perimetroTriangulo);

        System.out.println("Ingrese el lado del cuadrado:");
        double ladoCuadrado = Double.parseDouble(reader.readLine());

        double areaCuadrado = ladoCuadrado * ladoCuadrado;
        double perimetroCuadrado = 4 * ladoCuadrado;

        System.out.println("Área del cuadrado: " + areaCuadrado);
        System.out.println("Perímetro del cuadrado: " + perimetroCuadrado);

        System.out.println("Ingrese la base del rectángulo:");
        double baseRectangulo = Double.parseDouble(reader.readLine());
        System.out.println("Ingrese la altura del rectángulo:");
        double alturaRectangulo = Double.parseDouble(reader.readLine());

        double areaRectangulo = baseRectangulo * alturaRectangulo;
        double perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);

        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
    }
}
