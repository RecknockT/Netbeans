package ejer;

import java.util.Scanner;

/**
 * @author ffune
 */
public class Ejer3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase");
        String frase = leer.nextLine();
        if (frase.length() == 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");

        }
    }
    
}
