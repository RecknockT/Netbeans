package ejer;

import servicio.AlumnoServicios;
import java.util.Scanner;


public class Ejer3 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AlumnoServicios as = new AlumnoServicios();
        
        as.crearAlumno();
        
        System.out.println("Ingrese el alumno a buscar");
        as.buscarNotaFinalDe_(leer.next());
        
        
        
    }

}
