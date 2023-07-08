
package extra;

//@author Ale Funes

import java.util.Scanner;

public class Extra9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numeros enteros mayores que uno");
        int num1 = leer.nextInt();
        System.out.println("Ingrese numeros enteros mayores que uno");
        int num2 = leer.nextInt();
        int cont = 0;
        if (num1 < num2) {
            System.out.println("El dividendo es menor al divisor");
        }

        while (num1 >= num2) {
            System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
            num1 -= num2;
            cont++;
        }
        System.out.println("El residuo es: " + num1);
        System.out.println("El cociente es: " + cont);
    }

}
