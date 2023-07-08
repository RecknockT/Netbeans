
package ejer;

//@author Ale Funes
import java.util.Random;

public class Ejer4 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] matrizB = new int[4][4];
        rellenarYMostrar(matriz);
        transpuesta(matriz, matrizB);
    }

    public static void rellenarYMostrar(int[][] matriz) {
        Random rnd = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rnd.nextInt(10);
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void transpuesta(int[][] matriz, int[][] matrizB) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j] = matriz[j][i];
            }
        }
        for (int a = 0; a < matrizB.length; a++) {
            for (int b = 0; b < matrizB.length; b++) {
                System.out.print(matrizB[a][b]);
            }
            System.out.println("");
        }
    }
}
