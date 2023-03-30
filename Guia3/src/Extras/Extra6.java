
package Extras;

import java.util.Scanner;

/**
 * @author Alee
 */
public class Extra6 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        System.out.println("Ingrese la cantidad de personas"); 
        double Per = leer.nextDouble();
        double altu;
        double alt = 0;
        double altm= 0;
        double altmcont= 0;
        
        for (int i = 0; i < Per; i++) {
            System.out.println("Ingrese la altura de la persona nr" + i);
            altu = leer.nextDouble();
            alt += altu;
            if (altu < 1.60) {
                altm += altu;
                altmcont ++;
            }
        }
        System.out.println("Promedio general; " + (alt / Per));
        System.out.println("Promedio enanos; " + (altm / altmcont));
    }

}
