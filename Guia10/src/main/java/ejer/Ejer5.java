package ejer;

//@author Ale Funes

import servicio.PaisesServicios;

public class Ejer5 {

    public static void main(String[] args) {
        PaisesServicios ps = new PaisesServicios();
        ps.agregarPaises();
        ps.mostrar();
        System.out.println("**");
        ps.ordenarAlfa();
        System.out.println("**");
        ps.eliminarPais();
    }

}
