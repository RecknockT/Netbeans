
package com.mycompany.guia5;

//@author Ale Funes

import java.util.Random;
import java.util.Scanner;

public class Extra5 {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    Random rnd = new Random();
         
        System.out.println("Por favor ingrese el tamaño de la matriz");
        
        int [] [] matriz = new int [leer.nextInt()][leer.nextInt()];
        
        int suma = 0;
        
      for (int[] fila : matriz) {
            for (int i = 0; i < fila.length; i++) {
                fila[i] = rnd.nextInt(100); 
                suma += fila[i];
            }
        }
      
      for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
            System.out.println("El resultado de la suma es: "+ suma);
    }

}
