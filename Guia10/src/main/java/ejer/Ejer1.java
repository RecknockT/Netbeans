package ejer;

//@author Ale Funes

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer1 {

    public static void main(String[] args) {
        ArrayList <String> razas = new ArrayList();
        Scanner leer = new Scanner(System.in);
        String res;
        do {
            System.out.println("Ingrese la raza de la mascota");
            razas.add(leer.next());
            System.out.println("Desea seguir ingresando razas? S/N");
            res = leer.next().toUpperCase();
        } while (res.equals("S"));
        System.out.println(razas.toString());
    }

}
