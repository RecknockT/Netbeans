package Servicios;

// @author Ale Funes

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiJuego {
    Juego juego= new Juego();
    Scanner leer = new Scanner(System.in);
    ServiJugador sj = new ServiJugador();
    public void llenarJuego(ArrayList<Jugador>jugadores, Revolver r){
        juego.setJugadores(jugadores);
        juego.setRevolver(r);
    }
    
    public void ronda(){
        ArrayList<Jugador> jugadores = new ArrayList();
        Revolver r = new Revolver();
        ServiRevolver sr = new ServiRevolver();
        sr.llenarRevolver(r);
        System.out.println("Ingrese la cantidad de jugares para jugar");
        int cant = leer.nextInt();
        if (cant > 0 && cant < 7) {
            for (int i = 0; i < cant; i++) {
                jugadores.add(new Jugador());
            }
        } else {
            for (int i = 0; i < 6; i++) {
                jugadores.add(new Jugador());
            }
        }
        llenarJuego(jugadores, r);
        for (int i = 0; i < 6; i++) {
            System.out.println(juego.getRevolver().getPosiCargado());
            System.out.println(juego.getRevolver().getPosiActual());
            if (cant == i) {
                i = 0;
            }
            System.out.println("Jugador: " + jugadores.get(i).getNombre());
            if (sj.disparo(juego.getRevolver(),juego.getJugadores().get(i))) {
                System.out.println("Fin del juego");
                break;
            } else {
                System.out.println("Se sigue jugando");
            }
        }
        
    }
}
