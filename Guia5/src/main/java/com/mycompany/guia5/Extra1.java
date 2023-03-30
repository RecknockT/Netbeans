
package com.mycompany.guia5;
//Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
//con los valores ingresados por el usuario.

import java.util.Scanner;

//@author Ale Funes
public class Extra1 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int [] vector = new int [leer.nextInt()];
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un valor en la coordenada: " + i);
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de todos los valores es: " + suma);
    }

}
