package servicio;

// @author Ale Funes

import entidades.Espectador;
import java.util.Scanner;

public class ServiEspectador {
    private Scanner leer = new Scanner(System.in);
    public Espectador crearEspectador(){
        
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese dinero");
        int din = leer.nextInt();
        return new Espectador(nombre, edad, din);
    }
}
