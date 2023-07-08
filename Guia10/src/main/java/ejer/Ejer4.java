/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer;

import servicio.PeliculaServicio;

/**
 *
 * @author OvExX
 */
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         PeliculaServicio ps = new PeliculaServicio();
         ps.guardarListaPeli();
         ps.mostrar();
         System.out.println("Peliculas de duracion mayor a 1 hora");
         ps.mostrarMayor1h();
         System.out.println("titulo");
         ps.ordenarTitulo();
         System.out.println("director");
         ps.ordenarDirector();
         System.out.println("duracion ascendente");
         ps.ordenarDuracionAsc();
         System.out.println("duracion descendente");
         ps.ordenarDuracionDesc();
      }
 }
