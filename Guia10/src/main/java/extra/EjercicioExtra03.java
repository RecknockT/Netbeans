
package extra;

import entidades.Libro;
import java.util.HashSet;
import servicio.LibroService;


public class EjercicioExtra03 {

    public static void main(String[] args) {
        
        HashSet<Libro> libreria = new HashSet();
        LibroService ls = new LibroService();
        ls.agregarLibro(libreria);
        System.out.println(libreria);
        System.out.println("-------");
        if (ls.prestamo(libreria)) {
            System.out.println("Se presto el libro.");
        } else{
            System.out.println("No se pudo prestar ");
        }
        System.out.println(libreria);
        System.out.println("-------");
        if (ls.devolucion(libreria)) {
            System.out.println("Se devolvio el libro.");
        } else{
            System.out.println("No se pudo devolver.");
        }
        
        System.out.println(libreria);
        
        
        
    }

} 
