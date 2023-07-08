
package ejer;

//@author Ale Funes

import entidad.Cancion;
import servicios.ServiCancion;

public class Extra1 {

   
    public static void main(String[] args) {
        ServiCancion s1 = new ServiCancion();
        Cancion c1 = s1.musimundo();
        s1.mostrar(c1);
    }

}
