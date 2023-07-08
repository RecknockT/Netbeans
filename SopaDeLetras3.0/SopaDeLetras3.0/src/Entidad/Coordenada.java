package Entidad;

/**
 * @author SashaGameDC@gmail.com
 */
public class Coordenada {
    
    private int fila;
    private int colu;
    
    //CONSTRUCTORES
    public Coordenada() {
    }

    public Coordenada(int fila, int colu) {
        this.fila = fila;
        this.colu = colu;
    }
    
    //SETTERS
    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColu(int colu) {
        this.colu = colu;
    }
    
    //GETTERS
    public int getFila() {
        return fila;
    }

    public int getColu() {
        return colu;
    }
}