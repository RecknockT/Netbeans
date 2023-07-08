package servi;

// @author Ale Funes

import java.util.Arrays;
import java.util.Random;

public class ArregloServicio {
    Random rnd = new Random();
    public void inicializarA(double [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rnd.nextDouble() * 100; // Genera un número aleatorio entre 0 y 100
        }
    }
    public void mostrar(double[] arreglo) {
        System.out.println("");
        System.out.print(Arrays.toString(arreglo)+ " ");
    }
    public void ordenar(double[] arreglo) {
        System.out.println("");
        Arrays.sort(arreglo); // ordeno el arreglo de menor a mayor
        for (int i = 0; i < arreglo.length / 2; i++) { // divido por 2 para recorrerlo hasta la mitad
            double temp = arreglo[i]; // guardo la posicion i, ej posicion 0
            arreglo[i] = arreglo[arreglo.length - i - 1]; // guardo en la posicion i la posicion (longitud - i - 1), ej posicion 0 le guardo la ultima posicion
            arreglo[arreglo.length - i - 1] = temp; // guardo en la posicion (longitud - i - 1) la posicion que habia guardado en temp, ej la ultima posicion toma la posicion 0
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+", ");
        }
    }
    public void inicializarB(double[] arregloA, double[] arregloB) {
    double[] resultado = Arrays.copyOfRange(arregloA, 0, 10);
    Arrays.fill(resultado, 10, 20, 0.5);
    System.arraycopy(resultado, 0, arregloB, 0, resultado.length);
}
}
