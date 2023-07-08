package entidad;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {

    private String nombreCliente;

    private String dni;

    private Integer posicionAmarre;

    private Barco barco;

    private LocalDate fechaAlquiler;

    private LocalDate fechaDevolucion;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, String dni, Integer posicionAmarre, Barco barco, LocalDate fechaAlquiler, LocalDate fechaDevolucion) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
    }

    public double calcularPrecioAlquiler() {

        int numDias = (int) ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);

        return barco.calcularModulo() * numDias;
      /*
        Otra forma de obtener el num de dias.-
        public double calcularPrecioAlquiler() {
        int diasOcupacion = (int) fechaAlquiler.until(fechaDevolucion).getDays();
        double moduloBarco = barco.calcularModulo();

        return diasOcupacion * moduloBarco;
    }
        */
    }

}
