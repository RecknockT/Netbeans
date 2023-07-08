
package ejer;

//@author Ale Funes

import entidad.Rectangulo;
import servicios.ServiRectangulo;

public class Ejer4 {

   
    public static void main(String[] args) {
        ServiRectangulo s1 = new ServiRectangulo();
        Rectangulo rec1 = s1.Rellenar();
        System.out.println("El area es: "+s1.Perimetro(rec1));
        System.out.println("La superficie es: " + s1.Superficie(rec1));
        s1.Dibujar(rec1);
    }

}
