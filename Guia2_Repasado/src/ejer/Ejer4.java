package ejer;

import java.util.Scanner;
/**
 * @author ffune
 */
public class Ejer4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centigrados(usando comas)");
        double c = leer.nextDouble();
        double f =  32 + (9 * c / 5);
        System.out.println("En fahrenheit son " + f + " f");
    }
    
}
