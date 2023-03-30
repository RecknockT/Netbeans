
package com.mycompany.guia5;

//@author Ale Funes

import java.util.Random;
import java.util.Scanner;

public class Ejer3 {

   
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            Random rnd = new Random();
            System.out.println("Ingrese un numero");
            int[] vector = new int[leer.nextInt()];


            int cont1 = 0;
            int cont2 = 0;
            int cont3 = 0;
            int cont4 = 0;
            int cont5 = 0;

            for (int i = 0; i < vector.length; i++) {
                vector[i] = rnd.nextInt(99999);

            }

            for (int num : vector) {
                int num_digitos = Integer.toString(num).length();
                if (num_digitos == 1) {
                    cont1++;
                } else if (num_digitos == 2) {
                    cont2++;
                } else if (num_digitos == 3) {
                    cont3++;
                } else if (num_digitos == 4) {
                    cont4++;
                } else if (num_digitos == 5) {
                    cont5++;
                }
            }
            System.out.println("1 digito " + cont1);
            System.out.println("2 digitos " + cont2);
            System.out.println("3 digitos " + cont3);
            System.out.println("4 digitos " + cont4);
            System.out.println("5 digitos " + cont5);
}
}
