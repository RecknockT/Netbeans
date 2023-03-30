
package com.mycompany.guia5;

//@author Ale Funes

import java.util.Random;
import java.util.Scanner;

public class Extra6 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        String[] pala = new String[5];
        String[][] sopa = new String[20][20];
        String pa ;
        for (int i = 0; i < pala.length; i++) {
            System.out.println("Ingrese la palabra nr°"+i+" que posea de 3 a 5 caracteres");
            pa = leer.next();
            if (pa.length() >= 3 && pa.length() <= 5) {
                pala[i] = pa;
                
            } else {
                System.out.println("Fuera de rango");
                do {
                    System.out.println("Ingrese nuevamente una palabra dentro del rango");
                     pa = leer.next();
                } while (pa.length() < 3 || pa.length() > 5);
                pala[i] = pa;
            }
            
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = Integer.toString(0);
                
                
                
            }
        }
        
    }

}
