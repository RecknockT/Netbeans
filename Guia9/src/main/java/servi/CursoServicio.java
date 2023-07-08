package servi;

// @author Ale Funes

import entidad.Curso;
import java.util.Scanner;

public class CursoServicio {
    
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public String[] cargarAlumnos(){
        String[] alum = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre de alumno.");
            alum[i]=leer.next();
        }
        return alum;
    }
    
    public Curso crearCurso(){
        System.out.println("Nombre del curso");
        String curso = leer.next();
        System.out.println("Cantidad de horas");
        int horasDia = leer.nextInt();
        System.out.println("Cantidad de dias por semana. ");
        int dias = leer.nextInt();
        System.out.println("Turno?");
        String turno = leer.next();
        System.out.println("Precio por hora.");
        double precio = leer.nextDouble();
        return new Curso(curso, horasDia, dias, turno, precio, cargarAlumnos());
    }
    
    public double calcularGanancias(Curso a){
       return a.getPrecioPorHora()*a.getCantidadHorasPorDia()*a.getCantidadDiasPorSemana()*5;
    }
}
