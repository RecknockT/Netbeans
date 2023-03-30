package com.mycompany.guia5;
//Escriba un programa que averigüe si dos vectores de N enteros son iguales 
//(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).

import java.util.Random;
import java.util.Scanner;

//@author Ale Funes
public class Extra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Ingrese el tamaño del vector 1");
        int a = leer.nextInt();
        int[] vector1 = new int[a];
        int[] vector2 = new int[a];
        for (int i = 0; i < vector2.length; i++) {
            vector1[i] = rnd.nextInt(2);
            vector2[i] = rnd.nextInt(2);
            System.out.println(vector1[i]+" - "+vector2[i]);

        }
        System.out.println("");
        int cont = 0;
        for (int i = 0; i < vector1.length; i++) {
            
            if (vector1[i] != vector2[i]) {
                System.out.println(" ");
                System.out.println("No son iguales");
                break;
            }
            cont++;
        }
        
         if (cont == vector1.length) {
            System.out.println("Son iguales");
    }
   
}
    }
