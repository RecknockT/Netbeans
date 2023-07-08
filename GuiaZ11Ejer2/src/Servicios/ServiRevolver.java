package Servicios;

// @author Ale Funes
import Entidades.Revolver;
import java.util.Random;

public class ServiRevolver {

    Random rnd;

    public ServiRevolver() {
        this.rnd = new Random();
    }

    public void llenarRevolver(Revolver r1) {
        r1.setPosiActual(rnd.nextInt(6) + 1);
        r1.setPosiCargado(rnd.nextInt(6) + 1);
    }

    public boolean mojar(Revolver r1) {
        return r1.getPosiActual() == r1.getPosiCargado();
    }

    public void siguienteChorro(Revolver r1) {
        if (r1.getPosiActual() == 6) {
            r1.setPosiActual(1);
        } else {
            r1.setPosiActual(r1.getPosiActual() + 1);
        }
    }

   

}
