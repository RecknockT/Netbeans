
package ejer;

//@author Ale Funes

import java.util.Random;
import java.util.Scanner;

public class Ejer3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a ingresar");
        int[] vector = new int[leer.nextInt()];
        rellenar(vector);
        int[] contadores = new int[5]; // un contador para cada cantidad de dígitos
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
            int cantDigitos = String.valueOf(vector[i]).length();
            if (cantDigitos <= 5) {
                contadores[cantDigitos - 1]++;// se resta 1 por que el vector comienza en 0
            }
        }
        mostar(contadores);
    }

    public static void mostar(int[] contadores) {
        for (int i = 0; i < contadores.length; i++) {
            System.out.println("Cantidad de números con " + (i + 1) + " dígito(s): " + contadores[i]);
            // se suma +1 por que el vector comienza en 0 que seria 1 digito
        }
    }
    public static void rellenar(int[] vector) {
        Random rnd = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(10000);
            //System.out.println(vector[i]);
        }
    }
    
}
