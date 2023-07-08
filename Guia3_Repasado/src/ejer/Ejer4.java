package ejer;

import java.util.Scanner;
/**
 * @author ffune
 */
public class Ejer4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase");
        String frase = leer.next();
        if (frase.substring(0, 1).equalsIgnoreCase("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        /*
        if (frase.charAt(0) == 'A') {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        */
    }
    
}
