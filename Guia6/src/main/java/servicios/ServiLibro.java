package servicios;

// @author Ale Funes

import entidad.Libro;
import java.util.Scanner;

public class ServiLibro {
    private Scanner leer = new Scanner(System.in);
    
    public Libro cargarLibro() {
        System.out.print("Ingrese el número de ISBN: ");
        String isbn = leer.next();

        System.out.print("Ingrese el título del libro: ");
        String titulo = leer.next();

        System.out.print("Ingrese el autor del libro: ");
        String autor = leer.next();

        System.out.print("Ingrese el número de páginas del libro: ");
        int NPaginas = leer.nextInt();
        return new Libro(isbn, titulo, autor, NPaginas);
    }
}
