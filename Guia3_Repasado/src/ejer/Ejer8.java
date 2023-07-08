package ejer;

import java.util.Scanner;

public class Ejer8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un lado del cuadrado");
        int n1 = leer.nextInt();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                if (i == 0 || j == 0 || i == n1 - 1 || j == n1 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
