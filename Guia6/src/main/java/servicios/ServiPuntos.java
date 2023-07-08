package servicios;

// @author Ale Funes
import entidad.Puntos;
import java.util.Scanner;

public class ServiPuntos {

    private Scanner leer = new Scanner(System.in);

    public Puntos crearPuntos() {
        System.out.println("Ingrese x1");
        int X1 = leer.nextInt();
        System.out.println("Ingrese y1");
        int y1 = leer.nextInt();
        System.out.println("Ingrese x2");
        int X2 = leer.nextInt();
        System.out.println("Ingrese y2");
        int Y2 = leer.nextInt();
        return new Puntos(X1, y1, X2, Y2);
    }

    public double distancia(Puntos p1) {
        return Math.sqrt(Math.pow((p1.getX1() - p1.getX2()), 2) + Math.pow((p1.getY1() - p1.getY2()), 2));
    }
}
