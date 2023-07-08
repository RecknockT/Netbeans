package ejer;

//@author Ale Funes

import entidad.Juego;
import servicios.ServiJuego;

public class Extra3 {
   
    public static void main(String[] args) {
        ServiJuego s1 = new ServiJuego();
        Juego j1= s1.iniciar_juego();
        System.out.println(j1);
        
        
    }
}
