
package extra;

import java.util.Scanner;

/**
 * @author Alee
 */
public class Extra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su categorio de socio");
        char cate = leer.next().toLowerCase().charAt(0);
        System.out.println("Ingrese el costo del tratamiento");
        int costo = leer.nextInt();
        switch (cate) {
            case 'a':
                    System.out.println("El costo es de: " + costo*0.5);
                break;
            case 'b':
                System.out.println("El costo es de: " + costo * 0.65);
                break;
            case 'c':
                System.out.println("El costo es de: "+ costo);
                break;
            default:
                System.out.println("No existe esa categoria");
        }
    }

}
