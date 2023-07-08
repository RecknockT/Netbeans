package servicios;

// @author Ale Funes
import entidad.Juego;
import java.util.Scanner;

public class ServiJuego {

    private Scanner leer = new Scanner(System.in);

    public Juego iniciar_juego() {

        int Win1 = 0;
        int Win2 = 0;
        boolean res = true;
        System.out.println("Que jugador va a adivinar?");
        int pepe = leer.nextInt();
        if (pepe == 2) {
            while (res) {
            System.out.println("Jugador1\nIngrese el numero que debe adivinar el jugador 2");
            int num1 = leer.nextInt();
                System.out.println("------------------");
            System.out.println("Comienza la adivinanza\nJugador2\nIngrese el numero ");
            int juego = adivinanza(num1);
            if (juego == 5) {
                System.out.println("Fin del juego, Jugador 1 gana la partida");
                Win1++;
            } else {
                System.out.println("Fin del juego, Jugador 2 gana la partida en " + juego + " intentos.");
                Win2++;
            }
            System.out.println("Desea seguir jugando?true/false");
            res = leer.nextBoolean();
        }
        } else if (pepe == 1) {
            while (res) {
            System.out.println("Jugador2\nIngrese el numero que debe adivinar el jugador 1");
            int num1 = leer.nextInt();
                System.out.println("-----------------------");
            System.out.println("Comienza la adivinanza\nJugador1\nIngrese el numero ");
            int juego = adivinanza(num1);
            if (juego == 5) {
                System.out.println("Fin del juego, Jugador 2 gana la partida");
                Win2++;
            } else {
                System.out.println("Fin del juego, Jugador 1 gana la partida en " + juego + " intentos.");
                Win1++;
            }
            System.out.println("Desea seguir jugando?true/false");
            res = leer.nextBoolean();
        }
        }
        
        

        return new Juego(Win1, Win2);
    }

    public int adivinanza(int num1) {
        int cont = 0;
        int num2;
        do {
            System.out.println("Intento nr " + cont);
            num2 = leer.nextInt();
            if (num1 == num2) {
                System.out.println("Adivinaste");
                break;
            }
            if (num1 > num2) {
                System.out.println("El numero es mas alto");
            } else {
                System.out.println("El numero es mas bajo");
            }
            cont++;
        } while (cont != 5);
        return cont;
    }
}
