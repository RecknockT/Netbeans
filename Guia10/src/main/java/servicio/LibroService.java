package servicio;

import entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;


public class LibroService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void agregarLibro(HashSet<Libro> libreria){
        
        String resp = "S";
        do {
            
            System.out.println("Nombre del libro.");
            String nombre = leer.next();
            System.out.println("Nombre del autor.");
            String autor = leer.next();
            System.out.println("Ejemplares");
            int ejem = leer.nextInt();
            libreria.add(new Libro(nombre, autor, ejem));
            
            System.out.println("Quiere agregar otro libro?");
            resp = leer.next();
            
        } while (!resp.equalsIgnoreCase("n")); 
    }
    
    public boolean prestamo(HashSet<Libro> libreria){
        boolean conf = false;
        System.out.println("Que libro quiere?");
        String libro = leer.next();
        
        for (Libro aux : libreria) {
            if (aux.getTitulo().equalsIgnoreCase(libro) && aux.getEjemp() > aux.getEjempPrest()) {
                aux.setEjempPrest(aux.getEjempPrest()+1);
                conf = true;
            }
        }
        
        return conf;
    }
    
    public boolean devolucion(HashSet<Libro> libreria){
        boolean conf = false;
        System.out.println("Que libro quiere devolver?");
        String libro = leer.next();
        
        for (Libro aux : libreria) {
            if (aux.getTitulo().equalsIgnoreCase(libro)) {
                aux.setEjempPrest(aux.getEjempPrest()-1);
                conf = true;
            }
        }
        return conf;
    }
    
    
}
