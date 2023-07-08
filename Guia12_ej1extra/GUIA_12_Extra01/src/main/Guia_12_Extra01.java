/*
 
 */
package main;

import entidad.*;
import java.time.LocalDate;

public class Guia_12_Extra01 {

    public static void main(String[] args) {

        Barco velero1 = new Velero(3, "AB123", 1960, 20);
        Yate yate1 = new Yate(100, 4, "ZA123", 2023, 12);
        Lancha lancha1 = new Lancha(50, "BD001", 1980, 6);

        //System.out.println(velero1.toString());
        LocalDate fechaAlquiler = LocalDate.of(2023, 5, 1);
        LocalDate fechaDevolucion = LocalDate.of(2023, 6, 9);
        
        Alquiler alq1 = new Alquiler("Juanmelis", "92746507", 125, yate1, fechaAlquiler, fechaDevolucion);
        Alquiler alq2 = new Alquiler("Fabio", "12345678", 126, velero1, fechaAlquiler, fechaDevolucion);
        Alquiler alq3 = new Alquiler("Marcos", "12345679", 127, lancha1, fechaAlquiler, fechaDevolucion);
        
        System.out.println(alq1.calcularPrecioAlquiler());
        System.out.println("\n");
        System.out.println(alq2.calcularPrecioAlquiler());
        System.out.println("\n");
        System.out.println(alq3.calcularPrecioAlquiler());


    }

}
