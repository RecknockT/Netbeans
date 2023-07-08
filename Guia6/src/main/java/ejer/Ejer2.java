
package ejer;

//@author Ale Funes

import entidad.Circunferencia;
import servicios.ServiCircunferencia;

public class Ejer2 {
   
    public static void main(String[] args) {
        ServiCircunferencia s1 = new ServiCircunferencia();
        Circunferencia c1 = s1.crearCircunferencia();
        s1.area(c1);
        s1.perimetro(c1);
        System.out.println(c1);
        
    }

}
