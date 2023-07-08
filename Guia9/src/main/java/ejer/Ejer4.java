package ejer;

//@author Ale Funes

import servi.FechaServicio;
import java.util.Date;

public class Ejer4 {

    public static void main(String[] args) {
    FechaServicio s1 = new FechaServicio();
    Date d1 = s1.fechaNacimiento();
    Date d2 = s1.fechaActual();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println("Tiene "+Math.abs(s1.diferencia(d1, d2))+" años");
            
    }

}
