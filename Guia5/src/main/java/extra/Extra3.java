
package ejer;

//@author Ale Funes

import java.util.Random;
import java.util.Scanner;

public class Extra3 {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el tamaño de los vectores");
        int [] vector1 = new int [leer.nextInt()];
        rellenarVector(vector1);       
        mostrar(vector1);       
        }
    public static void rellenarVector(int[] vector) {
        Random rnd = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(100);        }
    }
    
    public static void mostrar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

}
