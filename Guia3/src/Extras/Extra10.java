
package Extras;

//@author Ale Funes

import java.util.Random;
import java.util.Scanner;

public class Extra10 {

   
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner leer = new Scanner(System.in);
        int n1 = rnd.nextInt(10);
        int n2 = rnd.nextInt(10);
        int n3 = n1 * n2;
        int n4;
        do {
            System.out.println("Ingrese el numero correcto");
            n4 = leer.nextInt();
            if (n3 == n4) {
                System.out.println("Correcto");
                break;
            }
            System.out.println("Sigue intentando");
        } while (true);
    }

}
