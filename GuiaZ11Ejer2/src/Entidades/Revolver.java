package Entidades;

// @author Ale Funes
public class Revolver {
    int posiActual;
    int posiCargado;

    public Revolver() {
    }

    public Revolver(int posiActual, int posiCargado) {
        this.posiActual = posiActual;
        this.posiCargado = posiCargado;
    }

    public int getPosiActual() {
        return posiActual;
    }

    public void setPosiActual(int posiActual) {
        this.posiActual = posiActual;
    }

    public int getPosiCargado() {
        return posiCargado;
    }

    public void setPosiCargado(int posiCargado) {
        this.posiCargado = posiCargado;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posiActual=" + posiActual + ", posiCargado=" + posiCargado + '}';
    }

    
}
