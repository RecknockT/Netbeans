package entidad;

// @author Ale Funes

import java.util.ArrayList;

public class Baraja {
    private ArrayList <Carta> barajin;

    public Baraja() {
        this.barajin=new ArrayList();
    }

    public Baraja(ArrayList<Carta> barajin) {
        this.barajin = barajin;
    }

    public ArrayList<Carta> getBarajin() {
        return barajin;
    }

    public void setBarajin(ArrayList<Carta> barajin) {
        this.barajin = barajin;
    }

    @Override
    public String toString() {
        return "Baraja{" + "barajin=" + barajin + '}';
    }
    
}
