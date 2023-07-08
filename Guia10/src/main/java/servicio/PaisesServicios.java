package servicio;

// @author Ale Funes
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class PaisesServicios {

    Scanner leer = new Scanner(System.in);
    private LinkedHashSet<String> listaPais = new LinkedHashSet();

    public void agregarPaises() {
        String opc;
        do {
            System.out.println("Ingrese el pais que desea guardar.");
            listaPais.add(leer.next());
            System.out.println("Dese agregar otro pais? S/N");
            opc = leer.next();

        } while (opc.equalsIgnoreCase("s"));

    }
    // Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
    // cómo se ordena un conjunto.

    public void mostrar() {
        System.out.println(listaPais.toString());

    }

    public void ordenarAlfa() {
        ArrayList<String> aux = new ArrayList(listaPais);

        Collections.sort(aux);

        System.out.println(aux.toString());

    }

    public void eliminarPais() {
        Iterator<String> it = listaPais.iterator();
        System.out.println("Ingrese el pais a eliminar");
        String pais = leer.next();
        boolean bandera = false;
        while (it.hasNext()) {
            if (pais.equalsIgnoreCase(it.next())) {
                it.remove();
                bandera = true;
            }
        }
        if (bandera) {
            System.out.println("Se elimino el pais");
            mostrar();
        } else {
            System.out.println("El pais no fue encontrado.");
        }

    }

}

