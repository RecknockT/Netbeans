package entidades;

// @author Ale Funes
import java.util.LinkedHashMap;

public class Cine {

    private LinkedHashMap<String, Espectador> matriz;
    private Pelicula peli;
    private int precioEntrada;

    public Cine() {
        this.matriz = new LinkedHashMap<>();
        this.peli = new Pelicula();
        this.precioEntrada = 0;
    }

    public Cine(LinkedHashMap<String, Espectador> matriz, Pelicula peli, int precioEntrada) {
        this.matriz = matriz;
        this.peli = peli;
        this.precioEntrada = precioEntrada;
    }

    public LinkedHashMap<String, Espectador> getMatriz() {
        return matriz;
    }

    public void setMatriz(LinkedHashMap<String, Espectador> matriz) {
        this.matriz = matriz;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "matriz=" + matriz + ", peli=" + peli + ", precioEntrada=" + precioEntrada + '}';
    }

    
}
