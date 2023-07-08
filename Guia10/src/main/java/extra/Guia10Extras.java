
package extra;

import java.util.ArrayList;
import java.util.Scanner;


public class Guia10Extras {

    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int suma = 0;
        
        while (num != -99) {
            lista.add(num);
            
            System.out.println("Ingrese otro numero");
            num= leer.nextInt();
        }
        
        for (Integer aux : lista) {
            
            System.out.println(aux);
            suma += aux;
        }
        
        double promedio =(double) suma / lista.size();
        
        System.out.println("La suma es de: "+suma);
        System.out.println("El promedio es de: "+String.format("%.2f", promedio));
        
    }

}
