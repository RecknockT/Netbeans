package servicios;

// @author Ale Funes
import entidad.Rectangulo2;
import java.util.Scanner;

public class ServiRectangulo2 {

    private Scanner leer = new Scanner(System.in);

    public Rectangulo2 CrearRectangulo() {
        System.out.println("Ingrese el lado1");
        int Lado1 = leer.nextInt();
        System.out.println("Ingrese el lado2");
        int Lado2 = leer.nextInt();
        return new Rectangulo2(Lado1, Lado2);
    }

    public int calcular_area(Rectangulo2 r2) {
        return r2.getLado1() * r2.getLado2();
    }
}
