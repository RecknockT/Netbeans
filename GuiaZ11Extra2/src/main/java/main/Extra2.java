/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import entidades.Cine;
import servicio.ServiCine;

/**
 *
 * @author Ale Funes
 */
public class Extra2 {

    public static void main(String[] args) {
        ServiCine sc = new ServiCine();
        Cine ci = sc.crearCine();
        sc.simularEspectadores(ci);
        sc.mostrarSala(ci);
    }
}
