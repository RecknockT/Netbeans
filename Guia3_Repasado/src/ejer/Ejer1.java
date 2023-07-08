package ejer;

import java.util.Scanner;

/**
 * @author ffune
 */
public class Ejer1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n1 = leer.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("no par");
        }
    }
    
}
