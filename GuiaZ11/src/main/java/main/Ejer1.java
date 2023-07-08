/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import entidades.Perro;
import entidades.Persona;

/**
 *
 * @author Ale Funes
 */
public class Ejer1 {

    public static void main(String[] args) {
        Perro perrin = new Perro("cacho", "callejero", "grandote", 10);
        Perro perrina = new Perro("cachi", "salchicha", "chiquito", 5);
        Persona p1 = new Persona("papa", "cerdito", 44, 43235135, perrin);
        Persona p2 = new Persona("mama", "cerdita", 33, 52349625, perrina);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
    }
}
