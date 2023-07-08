package servi;

// @author Ale Funes

import java.util.Date;
import java.util.Scanner;

public class FechaServicio {
    private final Scanner leer = new Scanner(System.in);
    public Date fechaActual(){
        return new Date();
    }
    public Date fechaNacimiento(){
        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt()-1;
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
    return new Date(anio-1900, mes, dia);
    }
    public int diferencia(Date d1, Date d2){
        // int anio1 = fecha1.getYear();
        //int anio2 = fecha2.getYear();
        //return anio2 - anio1;
        long diferencia = d1.getTime()- d2.getTime();
        double diferenciaAnios = diferencia / (365.25 * 24 * 60 * 60 * 1000);
        return (int) diferenciaAnios;
    }
    }
