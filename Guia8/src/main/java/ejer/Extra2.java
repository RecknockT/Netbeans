package ejer;

//@author Ale Funes

import entidad.NIF;
import servicio.NIFServicio;

public class Extra2 {

    public static void main(String[] args) {
    NIFServicio s1 = new NIFServicio();
    NIF n1 = s1.crearNIF();
    s1.mostrar(n1);
    }

}
