package servicios;

// @author Ale Funes

import entidad.Circunferencia;
import java.util.Scanner;

public class ServiCircunferencia {
    private Scanner leer = new Scanner(System.in);
    public Circunferencia crearCircunferencia() {
        System.out.println("Ingrese el radio");
        double radio = leer.nextDouble();
        return new Circunferencia(radio);
    }
    
    public double area(Circunferencia c1) {
        return Math.PI * Math.pow(c1.getRadio(), 2);
    }

    public double perimetro(Circunferencia c1) {
        return 2 * Math.PI * c1.getRadio();
    }
}
