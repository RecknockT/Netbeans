package entidad;

// @author Ale Funes
public class Cafetera {
    private final int capacidadMaxima = 2000;
    private int capacidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    
    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", capacidadActual=" + capacidadActual + '}';
    }
}
