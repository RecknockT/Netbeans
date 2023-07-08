/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dsada;

import java.time.LocalDate;

abstract class Barco {
    protected String matricula;
    protected double eslora;
    protected int anioFabricacion;

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public abstract double calcularModulo();

    public String getMatricula() {
        return matricula;
    }
}

class Velero extends Barco {
    private int numeroMastiles;

    public Velero(String matricula, double eslora, int anioFabricacion, int numeroMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public double calcularModulo() {
        return eslora * 10 + numeroMastiles;
    }
}

class BarcoMotor extends Barco {
    private double potenciaCV;

    public BarcoMotor(String matricula, double eslora, int anioFabricacion, double potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    @Override
    public double calcularModulo() {
        return eslora * 10 + potenciaCV;
    }
}

class YateLujo extends Barco {
    private double potenciaCV;
    private int numeroCamarotes;

    public YateLujo(String matricula, double eslora, int anioFabricacion, double potenciaCV, int numeroCamarotes) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public double calcularModulo() {
        return eslora * 10 + potenciaCV + numeroCamarotes;
    }
}

class Alquiler {
    private String nombreCliente;
    private String documentoCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler(String nombreCliente, String documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public double calcularPrecioAlquiler() {
        int diasOcupacion = (int) fechaAlquiler.until(fechaDevolucion).getDays();
        double moduloBarco = barco.calcularModulo();

        return diasOcupacion * moduloBarco;
    }
}

public class Dsada {
    public static void main(String[] args) {
        // Crear barcos
        Barco velero = new Velero("V1", 10, 2010, 2);
        Barco barcoMotor = new BarcoMotor("BM1", 15, 2015, 250);
        Barco yateLujo = new YateLujo("YL1", 20, 2018, 350, 5);

        // Crear alquileres
        LocalDate fechaAlquiler = LocalDate.of(2023, 6, 1);
        LocalDate fechaDevolucion = LocalDate.of(2023, 6, 8);

        Alquiler alquiler1 = new Alquiler("Cliente1", "123456789", fechaAlquiler, fechaDevolucion, 1, velero);
        Alquiler alquiler2 = new Alquiler("Cliente2", "987654321", fechaAlquiler, fechaDevolucion, 2, barcoMotor);
        Alquiler alquiler3 = new Alquiler("Cliente3", "456789123", fechaAlquiler, fechaDevolucion, 3, yateLujo);

        // Calcular precios de alquiler
        double precioAlquiler1 = alquiler1.calcularPrecioAlquiler();
        double precioAlquiler2 = alquiler2.calcularPrecioAlquiler();
        double precioAlquiler3 = alquiler3.calcularPrecioAlquiler();

        // Mostrar precios de alquiler
        System.out.println("Precio Alquiler 1: " + precioAlquiler1);
        System.out.println("Precio Alquiler 2: " + precioAlquiler2);
        System.out.println("Precio Alquiler 3: " + precioAlquiler3);
    }
}
