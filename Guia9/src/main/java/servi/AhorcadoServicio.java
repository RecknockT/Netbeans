package servi;

// @author Ale Funes
import entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicio {

    private final Scanner leer = new Scanner(System.in);
    Ahorcado a1 = new Ahorcado();
    public void crearJuego() {
        System.out.println("Comenzemos el juego");
        System.out.println("Ingrese la palabra");
        a1.setFrase(leer.next().toCharArray());
        a1.setLetrasDescubiertas(new boolean[a1.getFrase().length]);
        a1.setLetrasFaltantes(a1.getFrase().length);
        a1.setLongitud(a1.getFrase().length);
        System.out.println("Cantidad de oportunidades?");
        a1.setOportunidades(leer.nextInt());
    }

    public void mostrarLineaAhorcado() {
        for (int i = 0; i < a1.getFrase().length; i++) {
            if (a1.getLetrasDescubiertas()[i]) {
                System.out.print(a1.getFrase()[i] + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }

    public void longitud() {
        System.out.println("Su palabra contiene " + a1.getLongitud() + " letras");
    }

    public boolean buscar(char letra) {
        boolean letraEncontrada = false;

        for (int i = 0; i < a1.getFrase().length; i++) {
            if (a1.getFrase()[i] == letra) {
                a1.getLetrasDescubiertas()[i] = true;
                letraEncontrada = true;
            }
        }

        return letraEncontrada;
    }

    public boolean encontradas(char letra) {

        if (buscar(letra)) {
            for (int i = 0; i < a1.getLongitud(); i++) {
                if (a1.getFrase()[i] == letra) {
                    a1.setLetrasEncontradas(a1.getLetrasEncontradas() + 1);
                    a1.setLetrasFaltantes(a1.getLetrasFaltantes() - 1);
                }

            }

            System.out.println("Letras encontradas " + a1.getLetrasEncontradas());
            System.out.println("Letras falantes " + a1.getLetrasFaltantes());
            intentos();

            return true;
        } else {
            a1.setOportunidades(a1.getOportunidades() - 1);
            intentos();
            return false;
        }
    }

    public void intentos() {
        System.out.println("Oportunidades restantes " + a1.getOportunidades());
    }

    public void juego() {
        
        crearJuego();
        longitud();
        do {
            System.out.println("Ingrese una letra, no vale repetir");
            char letra = leer.next().charAt(0);
            if (encontradas(letra)) {
                mostrarLineaAhorcado();
            }
        } while (a1.getLetrasFaltantes() != 0 && a1.getOportunidades() != 0);

    }
}
