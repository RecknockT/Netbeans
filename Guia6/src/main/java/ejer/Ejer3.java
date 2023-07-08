
package ejer;

//@author Ale Funes

import entidad.Operacion;
import servicios.ServiOperacion;

public class Ejer3 {

   
    public static void main(String[] args) {
        ServiOperacion op = new ServiOperacion();
        Operacion p1 = op.crearOperacion();
        op.menu(p1);
        System.out.println(p1);


    }

}
