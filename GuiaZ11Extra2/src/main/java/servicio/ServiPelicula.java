package servicio;

// @author Ale Funes
import entidades.Pelicula;
import java.util.Scanner;

public class ServiPelicula {

    private Scanner leer = new Scanner(System.in);

    public Pelicula crearPelicula() {
        System.out.println("Ingrese el titulo de la pelicula");
        String titulo = leer.next();
        System.out.println("Ingrese el director de la pelicula");
        String director = leer.next();
        System.out.println("Ingrese la duracion la pelicula");
        int duracion = leer.nextInt();
        System.out.println("Ingrese la edad minima para ver la pelicula");
        int edadMin = leer.nextInt();
        
        return new Pelicula(titulo, director, duracion, edadMin);
    }
}
