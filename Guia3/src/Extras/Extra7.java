
package Extras;

import java.util.Scanner;

/**
 * @author Alee
 */
public class Extra7 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);    
        System.out.println("Ingrese la cantidad de numeros a ingresar");
        int cant = leer.nextInt();
        int min=0;
        int max=0;
        int num;
        int cont = 0;
        int cont2 = 0;
        int suma = 0;
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if (cont == 0) {
                min = num;
                max = num;
            }
            if (num<min) {
                min = num;
            }
            if (num>max) {
                max = num;
            }
            if (num > 0) {
                suma += num;
                cont2++;
            }
             cont++;
        } while (cont!=cant);
        System.out.println("El numero maximo "+max);
        System.out.println("El numero minimo "+min);
        System.out.println("El promedio ee " + (suma/cont2) );
        formab(cant);
    }
    public static void formab (int cant){
        Scanner leer = new Scanner(System.in);    
        int min=0;
        int max=0;
        int num;
        int cont = 0;
        int cont2 = 0;
        int suma = 0;
        while (cont!=cant) {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if (cont == 0) {
                min = num;
                max = num;
            }
            if (num<min) {
                min = num;
            }
            if (num>max) {
                max = num;
            }
            if (num > 0) {
                suma += num;
                cont2++;
            }
             cont++;
        }   
        System.out.println("El numero maximo "+max);
        System.out.println("El numero minimo "+min);
        System.out.println("El promedio ee " + (suma/cont2) );
    }
            
}
