
package ejer;

//@author Ale Funes

import entidad.Puntos;
import servicios.ServiPuntos;

public class Extra2 {

   
    public static void main(String[] args) {
    ServiPuntos s1 = new ServiPuntos();
    Puntos p1 = s1.crearPuntos();
    System.out.println("la distancia entre ambos puntos es: "+ s1.distancia(p1));
    }

}
