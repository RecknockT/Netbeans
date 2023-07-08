
package extra;

//@author Ale Funes

import java.util.Scanner;

public class Extra11 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int contador = 0;
        while (num != 0) {
            contador++;
            num /= 10;
        }

        System.out.println("El número ingresado tiene " + contador + " dígitos.");
    

}
}
