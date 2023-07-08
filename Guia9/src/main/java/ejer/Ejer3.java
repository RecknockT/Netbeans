package ejer;

//@author Ale Funes

import servi.ArregloServicio;

public class Ejer3 {

    public static void main(String[] args) {
    double [] A = new double [50];
    double [] B = new double [20];
    ArregloServicio s1 = new ArregloServicio();
    s1.inicializarA(A);
    s1.mostrar(A);
    s1.ordenar(A);
    s1.inicializarB(A, B);
    s1.mostrar(B);
    }
    
    

}
