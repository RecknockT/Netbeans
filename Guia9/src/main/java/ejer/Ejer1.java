package ejer;

import entidad.Cadena;
import servi.CadenaServicio;

/**
 * @author Ale Funes
 */
public class Ejer1 {

    public static void main(String[] args) {
        CadenaServicio s1 = new CadenaServicio();
        Cadena c1 = s1.crearCadena();
        s1.mostrarMenu(c1);
    }
}