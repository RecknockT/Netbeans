package entidades;

// @author Ale Funes
import java.util.HashMap;

public class Tienda {
    private HashMap<String, Double> productos;

    public Tienda() {
        this.productos = new HashMap<>();
    }

    
    public HashMap<String, Double> getProductos() {
        return productos;
    }
}
