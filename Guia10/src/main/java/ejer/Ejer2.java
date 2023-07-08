package ejer;

//@author Ale Funes

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejer2 {

    public static void main(String[] args) {
      ArrayList <String> razas = new ArrayList();
        Scanner leer = new Scanner(System.in);
        String res;
        do {
            System.out.println("Ingrese la raza de la mascota");
            razas.add(leer.next());
            System.out.println("Desea seguir ingresando razas? S/N");
            res = leer.next().toUpperCase();
        } while (!res.equals("N"));
        System.out.println(razas.toString());
        System.out.println("Ingrese el nombre a buscar en la lista");
        String perrin = leer.next();
//        if (razas.contains(perrin)) {
//        razas.remove(perrin);
//        } else{
//            System.out.println("No se encontro");
//        
        Iterator <String> ite = razas.iterator();
        while (ite.hasNext()) {
            String sas = ite.next();
            if (sas.equals(perrin)) {
                ite.remove();
            }
        }
        if (!razas.contains(perrin)) {
            System.out.println("No se encontro a la raza");
        }
        Collections.sort(razas);
        System.out.println(razas.toString());
    }

}
