package ejer;

import java.util.Scanner;
/**
 * @author ffune
 */
public class Ejer1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int n1 = leer.nextInt();
        System.out.println("ingrese un numero");
        int n2 = leer.nextInt();
        System.out.println("La suma es: " + (n1+n2) );
    }
}
