/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ale Funes
 */
public class Extra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Perro> perritos = new ArrayList();
        ArrayList<Persona> personitas = new ArrayList();
        boolean bandera = false;
        boolean bandera2 = false;
        perritos.add(new Perro("cacho", "callejero", "grandote", 10));
        perritos.add(new Perro("cachi", "salchicha", "chiquito", 5));
        personitas.add(new Persona("papa", "cerdito", 44, 43235135));
        personitas.add(new Persona("mama", "cerdita", 33, 52349625));
        System.out.println("ingrese el nombre del adoptante");
        String aux = leer.next();
        for (Persona personita : personitas) {
            if (personita.getNombre().equalsIgnoreCase(aux)) {
                bandera = true;
                System.out.println("Que perro quiere?");
                String aux2 = leer.next();
                for (Perro perrito : perritos) {
                    if (perrito.getNombre().equalsIgnoreCase(aux2)) {
                        bandera2 = true;
                        personita.setPerrito(perrito);
                        perritos.remove(perrito);
                        break;
                    }
                }
            } 
        }
        if (!bandera) {
            System.out.println("No existe la persona");
        }
        if (!bandera2) {
            System.out.println("No existe o ya fue adoptado el perro");
        }
        for (Persona personita : personitas) {
            System.out.println(personita.toString());
        }
    }
}
