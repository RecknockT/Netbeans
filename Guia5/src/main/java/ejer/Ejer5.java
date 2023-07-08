package ejer;

//@author Ale Funes
import java.util.Random;

public class Ejer5 {

    public static void main(String[] args) {
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matrizB = new int[3][3];
        int cont = 0;
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        //rellenarYMostrar(matriz);
        transpuesta(matriz,matrizB);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != -matrizB[i][j]) {
                    System.out.println("No es asimetrica");
                    i = 4;
                    break;
                }
                cont++;
            }
        }
        if (cont == 9) {
            System.out.println("Es asimetrica");
        }
    }

    public static void rellenarYMostrar(int[][] matriz) {
        Random rnd = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = rnd.nextInt(20)-10;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void transpuesta(int[][] matriz, int[][] matrizB) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j] = matriz[j][i];
            }
        }
        for (int a = 0; a < matrizB.length; a++) {
            for (int b = 0; b < matrizB.length; b++) {
                System.out.print(matrizB[a][b] + " ");
            }
            System.out.println("");
        }
    }
}
