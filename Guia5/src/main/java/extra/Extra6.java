package ejer;

//@author Ale Funes
import java.util.Random;
import java.util.Scanner;

public class Extra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        String[] palabras = new String[5];
        char[][] Sopa = new char[20][20];
        for (int i = 0; i < palabras.length; i++) {
            String palabra;
            do {
                System.out.println("Ingrese la palabra número " + (i + 1) + ", debe contener entre 3 a 5 caracteres");
                palabra = leer.next();
            } while (palabra.length() < 3 || palabra.length() > 5);
            palabras[i] = palabra;
        }
        int fila;
        int col = 0;
        for (String palabra : palabras) {
            boolean ubicado = false;
            do {
                fila = rnd.nextInt(20);
                ubicado = true;
                for (int i = 0; i < palabra.length(); i++) {
                    if (Sopa[fila][col + i] != '\u0000') { // Si hay una letra ya ubicada en esa posición
                        ubicado = false; // No se puede ubicar en esa fila, se intenta con otra
                        break;
                    }
                }
            } while (!ubicado); // Se sigue buscando una fila libre hasta encontrarla

            // Se ubica la palabra en la fila seleccionada
            for (int i = 0; i < palabra.length(); i++) {
                Sopa[fila][col + i] = palabra.charAt(i);
            }
        }

        for (int i = 0; i < Sopa.length; i++) {
            for (int j = 0; j < Sopa[i].length; j++) {
                if (Sopa[i][j] == '\u0000') { // Si el espacio está vacío
                    Sopa[i][j] = (char)(rnd.nextInt(10) + '0'); // Rellenamos con un número aleatorio del 0 al 9
                }
            }
        }
        
         for (int i = 0; i < Sopa.length; i++) {
            for (int j = 0; j < Sopa[i].length; j++) {
                System.out.print(Sopa[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
