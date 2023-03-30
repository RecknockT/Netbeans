
package Extras;

//@author Ale Funes

import java.util.Scanner;

public class Extra11 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int cont = 1;
        if (num <= 9) {
            System.out.println("Tiene un 1 digito");
        } else {
            do {
                num = (int) num / 10;
                cont++;
                if (num < 10) {
                    break;
                }
            } while (true);
            System.out.println(cont);
        }

}
}
