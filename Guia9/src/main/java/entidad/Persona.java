package entidad;

// @author Ale Funes

import java.util.Date;

public class Persona {
    private String nombre;
    private Date fNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fNacimiento) {
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fNacimiento=" + fNacimiento + '}';
    }
    
}
