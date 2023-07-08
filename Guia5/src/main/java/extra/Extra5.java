package ejer;

//@author Ale Funes
import java.util.Random;
import java.util.Scanner;

public class Extra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Por favor ingrese el tamaño de la matriz");

        int filas = leer.nextInt();
        int columnas = leer.nextInt();

        int[][] matriz = new int[filas][columnas];

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rnd.nextInt(10);
                suma += matriz[i][j];
            }
        }

        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        System.out.println("El resultado de la suma es: " + suma);
    }

}
