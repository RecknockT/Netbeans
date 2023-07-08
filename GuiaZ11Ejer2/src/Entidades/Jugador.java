package Entidades;

// @author Ale Funes
public class Jugador {
    private static int contador = 1;
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
        this.id = contador++;
        this.nombre = "Jugador"+id;
        this.mojado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean ismojado() {
        return mojado;
    }

    public void setmojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
}
