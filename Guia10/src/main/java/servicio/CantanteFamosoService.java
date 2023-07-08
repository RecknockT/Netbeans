package servicio;

import entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CantanteFamosoService {

    ArrayList<CantanteFamoso> cf;
    Scanner leer;

    public CantanteFamosoService() {
        this.cf = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void agregarCantante() {
        String nombre, disc;
        System.out.println("Nombre del artista");
        nombre = leer.next();
        System.out.println("Disco mas vendido?");
        disc = leer.next();

        cf.add(new CantanteFamoso(nombre, disc));

    }

    public void mostrar() {
        System.out.println(cf);
    }

    public void eliminar() {
        Iterator<CantanteFamoso> it = cf.iterator();
        System.out.println("Cantante a eliminar");
        String eliminar = leer.next();

        while (it.hasNext()) {
            CantanteFamoso next = it.next();
            if (next.getNombre().equalsIgnoreCase(eliminar)) {
                it.remove();
            }
        }

    }

    public void menu() {

        int opcion;
        do {

            System.out.println("1. Agregar cantante.");
            System.out.println("2. Eliminar cantante.");
            System.out.println("3. Mostrar cantantes.");
            System.out.println("4. Salir.");
            System.out.print("Ingrese la opción: ");
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    agregarCantante();
                    break;
                case 2:
                    eliminar();
                    break;
                case 3:
                    mostrar();
                    break;
                case 4:
                    System.out.println("Chau.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente nuevamente.");
                    break;
            }
            System.out.println();
        } while (opcion != 4);
    }

}
