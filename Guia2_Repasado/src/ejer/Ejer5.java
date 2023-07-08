package ejer;

import java.util.Scanner;

/**
 * @author ffune
 */
public class Ejer5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int n1 = leer.nextInt();
        System.out.println("El doble es " + n1*2);
        System.out.println("El triple es " + n1*3);
        System.out.println("Y la raiz cuadrada es " + Math.sqrt(n1));
    }
    
}
