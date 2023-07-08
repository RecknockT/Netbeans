package ejer;

//@author Ale Funes
import java.util.Scanner;

public class Ejer6 {

    public static void main(String[] args) {
        int[][] cuadrado = new int[3][3];

        System.out.println("Introduce los números del cuadrado mágico:");
        leerCuadrado(cuadrado);

        if (esCuadradoMagico(cuadrado)) {
            System.out.println("Es un cuadrado mágico!");
        } else {
            System.out.println("No es un cuadrado mágico.");
        }
    }

    public static void leerCuadrado(int[][] cuadrado) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Fila " + (i + 1) + ", Columna " + (j + 1) + ": ");
                cuadrado[i][j] = sc.nextInt();

                if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("Error: los números deben estar entre 1 y 9.");
                    return;
                }
            }
        }
    }

    public static boolean esCuadradoMagico(int[][] cuadrado) {
        int[] sumaFilas = new int[3];
        int[] sumaColumnas = new int[3];
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaFilas[i] += cuadrado[i][j];
                sumaColumnas[j] += cuadrado[i][j];

                if (i == j) {
                    sumaDiagonalPrincipal += cuadrado[i][j];
                }

                if (i + j == 2) {
                    sumaDiagonalSecundaria += cuadrado[i][j];
                }
            }
        }

        int sumaMagica = sumaFilas[0];
        for (int i = 1; i < 3; i++) {
            if (sumaFilas[i] != sumaMagica || sumaColumnas[i] != sumaMagica) {
                return false;
            }
        }
        if (sumaDiagonalPrincipal != sumaMagica || sumaDiagonalSecundaria != sumaMagica) {
            return false;
        }

        return true;
    }
}
