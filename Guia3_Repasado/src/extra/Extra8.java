
package extra;

import java.util.Scanner;

/**
 * @author Alee
 */
public class Extra8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int cont = 0;
        int contP = 0;
        int contI = 0;

        do {
            System.out.println("Ingrese numeros enteros");
            num = leer.nextInt();
            if (num > 0) {
                if (num % 5 == 0) {
                    break;
                }
                if (num % 2 == 0) {
                    contP++;
                } else {
                    contI++;
                }
                cont++;
            }
        } while (true);
        System.out.println("Cantidad de numeros leidos: " + cont);
        System.out.println("Cantidad de numeros pares: " + contP);
        System.out.println("Cantidad de numeros impares: " + contI);
    }

}
