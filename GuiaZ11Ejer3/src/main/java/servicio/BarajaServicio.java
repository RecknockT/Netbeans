package servicio;

// @author Ale Funes
import entidad.Baraja;
import entidad.Carta;
import enums.Numero;
import enums.Palo;
import java.util.Collections;
import java.util.Scanner;

public class BarajaServicio {

    Baraja barajita = new Baraja();
    Baraja monton = new Baraja();
    Scanner leer = new Scanner(System.in);

    public void crearBaraja() {
        for (Palo palin : Palo.values()) {
            for (Numero num : Numero.values()) {
                barajita.getBarajin().add(new Carta(palin, num.getValor()));
            }
        }
    }

    public void mostrarBaraja() {
        for (Carta aux : barajita.getBarajin()) {
            System.out.println(aux.toString());
        }
    }

    public void barajar() {
        Collections.shuffle(barajita.getBarajin());
    }

    public void siguienteCarta() {
        if (barajita.getBarajin().isEmpty()) {
            System.out.println("No hay más cartas en la baraja");
        } else {
            System.out.println(barajita.getBarajin().get(0));
            monton.getBarajin().add(barajita.getBarajin().get(0));
            barajita.getBarajin().remove(0);
        }
    }

    public void cartasDisponibles() {
        System.out.println("quedan " + barajita.getBarajin().size() + " cartas");
    }

    public void darCartas() {
        System.out.println("Cuantas cartas quiere?");
        int canti = leer.nextInt();
        if (barajita.getBarajin().size() >= canti) {
            for (int i = 0; i < canti; i++) {
                siguienteCarta();
            }
        } else {
            System.out.println("No haay cartas suficientes");
        }
    }

    public void cartasMonton() {
        if (!monton.getBarajin().isEmpty()) {
            for (Carta aux : monton.getBarajin()) {
                System.out.println(aux.toString());
            }
        } else {
            System.out.println("Esta vacio el monton");
        }
    }

    public void menu() {
        boolean salir = false;

        while (!salir) {
            System.out.println("=== Menú de la Baraja ===");
            System.out.println("1. Crear baraja");
            System.out.println("2. Mostrar baraja");
            System.out.println("3. Barajar");
            System.out.println("4. Siguiente carta");
            System.out.println("5. Cartas disponibles");
            System.out.println("6. Dar cartas");
            System.out.println("7. Mostrar cartas en el montón");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = leer.nextInt();
            leer.nextLine(); // Limpiar el salto de línea después de leer la opción

            switch (opcion) {
                case 1:
                    crearBaraja();
                    System.out.println("Baraja creada.");
                    break;
                case 2:
                    mostrarBaraja();
                    break;
                case 3:
                    barajar();
                    System.out.println("Baraja barajada.");
                    break;
                case 4:
                    siguienteCarta();
                    break;
                case 5:
                    cartasDisponibles();
                    break;
                case 6:
                    darCartas();
                    break;
                case 7:
                    cartasMonton();
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número válido.");
                    break;
            }

            System.out.println(); // Salto de línea para separar las iteraciones del menú
        }
    }
}
