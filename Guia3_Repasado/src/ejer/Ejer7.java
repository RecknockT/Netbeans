package ejer;


import java.util.Scanner;

public class Ejer7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        do {
          System.out.println("Ingrese la cadena");           
        String cadena = leer.next();
            if (cadena.equals("&&&&&")) {
                break;
            }
        if (cadena.length() > 1 && cadena.length() < 6 && cadena.substring(0, 1).equalsIgnoreCase("X") && cadena.substring(cadena.length()-1).equalsIgnoreCase("O")) {
            correctas++;
        } else {
            incorrectas++;
        }  
        } while (true);
        /*
        do {
            System.out.println("Ingrese la cadena");
            String cadena = leer.next();
            if (cadena.equals("&&&&&")) {
                break;
            }
            if (cadena.length() > 1 && cadena.length() < 6 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
                correctas++;
            } else {
                Incorrectas++;
            }
        } while (true);
        */
        System.out.println("correctas: " + correctas);
        System.out.println("incorrectas: " + incorrectas);
        
    }
    
}
