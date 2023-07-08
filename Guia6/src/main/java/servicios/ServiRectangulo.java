package servicios;

// @author Ale Funes
import entidad.Rectangulo;
import java.util.Scanner;

public class ServiRectangulo {

    private Scanner leer = new Scanner(System.in);

    public Rectangulo Rellenar() {
        System.out.println("Ingrese la base");
        double Base = leer.nextDouble();
        System.out.println("Ingrese la altura");
        double Altura = leer.nextDouble();
        return new Rectangulo(Base, Altura);
    }

    public double Superficie(Rectangulo r1) {
        return r1.getBase() * r1.getAltura();
    }

    public double Perimetro(Rectangulo r1) {
        return (r1.getAltura() + r1.getBase()) * 2;
    }

    public void Dibujar(Rectangulo r1) {
        for (int i = 0; i < r1.getBase(); i++) {
            for (int j = 0; j < r1.getAltura(); j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
