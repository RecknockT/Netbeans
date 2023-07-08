package com.mycompany.guiaz12;

//@author Ale Funes

import entidad.Persona;
import servicio.PersonaServicio;

public class ejer1 {

    public static void main(String[] args) {
    PersonaServicio ps = new PersonaServicio();
    Persona p = null;
        try {
            ps.calcularIMC(p);
        } catch (Exception e) {
            System.out.println("Objeto vacio");
        }
    }

}
