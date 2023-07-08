
package ejer;

import entidad.Libro;
import servicios.ServiLibro;

/**
 * @author Ale Funes
 */
public class Ejer1 {

    public static void main(String[] args) {
        ServiLibro s1 = new ServiLibro();
        Libro l1 = s1.cargarLibro();
        System.out.println(l1);
        
    }
}
