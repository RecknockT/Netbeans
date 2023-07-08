package ejer;

//@author Ale Funes

import entidad.Persona;
import servi.PersonaServicio;

public class Ejer5 {

    public static void main(String[] args) {
        PersonaServicio s1 = new PersonaServicio();
        Persona p1 = s1.crearPersona();
        System.out.println("Su edad es de: "+s1.calcularEdad(p1.getfNacimiento()));
        
    }

}
