package servi;

// @author Ale Funes
import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.println("Ingrese su primer nombre");
        String nombre = leer.next();
        System.out.println("Ingrese su fecha de nacimiento");
        Date fNacimiento = fechaNacimiento();
        return new Persona(nombre, fNacimiento);
    }

    private Date fechaNacimiento() {
        System.out.println("Ingrese el dia de nacimiento:");
        int dia = leer.nextInt();

        System.out.println("Ingrese el mes de nacimiento:");
        int mes = leer.nextInt();

        System.out.println("Ingrese el año de nacimiento:");
        int anio = leer.nextInt();

        return new Date(anio - 1900, mes - 1, dia);
    }

    public int calcularEdad(Date fechaNacimiento) {
        Date d1 = new Date();
        long diferencia = d1.getTime() - fechaNacimiento.getTime();
        double diferenciaAnios = diferencia / (365.25 * 24 * 60 * 60 * 1000);
        return (int) diferenciaAnios;
    }
}
