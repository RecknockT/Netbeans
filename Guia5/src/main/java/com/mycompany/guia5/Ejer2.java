
package com.mycompany.guia5;

//@author Ale Funes

import java.util.Random;
import java.util.Scanner;

public class Ejer2 {

   
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Ingrese el tamaño del vector");
       // int num = leer.nextInt();
        int[] vector = new int[leer.nextInt()];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(10);
            
        }
        
        
        System.out.println("Que numero quiere buscar");
        int buscar = leer.nextInt();
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == buscar) {
                cont++;
                System.out.println("Se encontro el numero en la posicion " + i);
            } 
            
            
        }
        System.out.println("Se encontro el numero  " + cont + " veces.");
    }

}
