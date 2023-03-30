
package com.mycompany.guia5;

//@author Ale Funes

import java.util.Scanner;

public class Ejer6 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] cuadrado = new int[3][3];
        int[] sumaFilas = new int[3];
        int[] sumaColumnas = new int[3];
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;

        System.out.println("Introduce los números del cuadrado mágico:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Fila " + (i+1) + ", Columna " + (j+1) + ": ");
                cuadrado[i][j] = sc.nextInt();

                if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("Error: los números deben estar entre 1 y 9.");
                    return;
                }
            }
        }

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
                System.out.println("No es un cuadrado mágico.");
                return;
            }
        }
        if (sumaDiagonalPrincipal != sumaMagica || sumaDiagonalSecundaria != sumaMagica) {
            System.out.println("No es un cuadrado mágico.");
            return;
        }

        System.out.println("Es un cuadrado mágico!");
    }
}

