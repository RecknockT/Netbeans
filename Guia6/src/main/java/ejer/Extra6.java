
package ejer;

//@author Ale Funes

import entidad.Rectangulo2;
import servicios.ServiRectangulo2;

public class Extra6 {

   
    public static void main(String[] args) {
        ServiRectangulo2 s1 = new ServiRectangulo2();
        Rectangulo2 r2 = s1.CrearRectangulo();
        System.out.println("El area es: " + s1.calcular_area(r2));
        System.out.println(r2);
    }
}
