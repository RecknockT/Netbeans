package ejer;

//@author Ale Funes

import entidad.ParDeNumeros;
import servi.ParDeNumerosServicio;

public class Ejer2 {

    public static void main(String[] args) {
    ParDeNumerosServicio s1 = new ParDeNumerosServicio();
    ParDeNumeros par = s1.crearPar();
    s1.mostar(par);
    System.out.println("El numero mayor es"+s1.devolverMayor(par));
    System.out.println(s1.calcularPotencia(par));
    System.out.println(s1.calculaRaiz(par));
    }

}
