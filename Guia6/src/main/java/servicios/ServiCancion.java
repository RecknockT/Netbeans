

package servicios;

// @author Ale Funes

import entidad.Cancion;
import java.util.Scanner;

public class ServiCancion {
    private Scanner leer = new Scanner(System.in);
    public Cancion musimundo(){
        System.out.println("Ingrese el autor");
        String autor = leer.next();
        System.out.println("Ingrese el titulo");
        String Titulo = leer.nextLine();
        return new Cancion(autor, Titulo);
    }
    public void mostrar(Cancion c1){
        System.out.println(c1.toString());
    }
}
