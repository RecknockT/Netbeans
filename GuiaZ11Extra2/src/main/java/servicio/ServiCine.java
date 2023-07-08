package servicio;

// @author Ale Funes
import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ServiCine {

    ServiEspectador se = new ServiEspectador();
    ServiPelicula sp = new ServiPelicula();
    Scanner leer = new Scanner(System.in);
    Random rnd = new Random();

    public Cine crearCine() {
        System.out.println("Precio de entrada?");
        int precio = leer.nextInt();
        Pelicula pl = sp.crearPelicula();
        LinkedHashMap<String, Espectador> matriz = new LinkedHashMap();
        for (int fila = 8; fila >= 1; fila--) {
            for (char columna = 'A'; columna <= 'F'; columna++) {
                String asiento = fila + " " + columna;
                matriz.put(asiento, null);
            }
        }
        return new Cine(matriz, pl, precio);
    }

    public void simularEspectadores(Cine cine) {
        List<String> asientosDisponibles = new ArrayList<>(cine.getMatriz().keySet());
        for (int i = 0; i < 48; i++) {
            if (asientosDisponibles.isEmpty()) {
                System.out.println("No hay más asientos disponibles.");
                break;
            }

            int indiceAsiento = rnd.nextInt(asientosDisponibles.size());
            String asiento = asientosDisponibles.get(indiceAsiento);
            asientosDisponibles.remove(indiceAsiento);

            int edad = rnd.nextInt(80) + 1;
            int dinero = rnd.nextInt(5000);
            Espectador espectador = new Espectador("Espectador " + (i + 1), edad, dinero);
            System.out.println(espectador.toString());
            if (espectador.getEdad() >= cine.getPeli().getEdadMin() && espectador.getDinero() >= cine.getPrecioEntrada()) {
                cine.getMatriz().put(asiento, espectador);
            }
        }
    }

    public void mostrarSala(Cine cine) {
        for (Map.Entry<String, Espectador> entry : cine.getMatriz().entrySet()) {
            String asiento = entry.getKey();
            Espectador espectador = entry.getValue();

            if (espectador != null) {
                System.out.print("X ");
            } else {
                System.out.print("- ");
            }

            if (asiento.endsWith("F")) {
                System.out.println();
            }
        }
    }

}
