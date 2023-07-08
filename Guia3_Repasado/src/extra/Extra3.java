package extra;

import java.util.Scanner;

/**
 * @author ffune
 */
public class Extra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        char letra = leer.next().toLowerCase().charAt(0);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {
            System.out.println("Vocal");
        } else {
            System.out.println("Consonante");
        }
  }
    
}
