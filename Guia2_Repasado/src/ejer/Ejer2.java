package ejer;

import java.util.Scanner;

/**
 * @author ffune
 */
public class Ejer2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        String nom = leer.nextLine();
        System.out.println("Tu nombre es " + nom);
    }
    
}
