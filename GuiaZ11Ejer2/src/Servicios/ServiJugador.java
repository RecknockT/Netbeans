package Servicios;

// @author Ale Funes

import Entidades.Jugador;
import Entidades.Revolver;

public class ServiJugador {
    
    ServiRevolver sr = new ServiRevolver();
    public boolean disparo(Revolver r1,Jugador j) {
        System.out.println(j.getNombre() + " se apunta con el revolver de agua...");
        if (sr.mojar(r1)) {
            j.setmojado(true);
            System.out.println("¡El agua sale y " + j.getNombre() + " se moja!");
            return true;
        } else {
            System.out.println("¡El agua no sale! " + j.getNombre() + " pasa el revolver al siguiente jugador.");
            sr.siguienteChorro(r1);
            return false;
        }
    }
    
}
