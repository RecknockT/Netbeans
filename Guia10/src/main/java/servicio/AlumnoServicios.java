package servicio;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author ff
 */
public class AlumnoServicios {

    private Scanner leer;
    private ArrayList<Alumno> listaAlumnos;

    public AlumnoServicios() {
        this.listaAlumnos = new ArrayList<Alumno>();
        this.leer = new Scanner(System.in);
    }

    public void crearAlumno() {
        String rta;
        ArrayList<Integer> notas = new ArrayList<Integer>();

        do {
            System.out.println("Ingrese el nombre del alumno");
            String nombre = leer.next();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese las notas");
                Integer nota = leer.nextInt();
                notas.add(nota);
            }
            Alumno alum = new Alumno(nombre, notas);
            listaAlumnos.add(alum);
            System.out.println("¿Quiere seguir agregando alumnos? S/N");
            rta = leer.next();
        } while (!rta.equalsIgnoreCase("N"));

    }

    public void buscarNotaFinalDe_(String alumn) {
        boolean encontrado = false;
        Iterator<Alumno> ite = listaAlumnos.iterator();
        double promedio = 0;
        while (ite.hasNext()) {
            Alumno alumno = ite.next();
            if (alumno.getNombre().equalsIgnoreCase(alumn)) {
                promedio = notaFinal(alumno);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El alumno no se encuentra en la lista.");
        }
        System.out.println("El promedio es: "+ promedio);
    }

    public double notaFinal(Alumno alum) {
        
        ArrayList<Integer> notas = alum.getNotas();
        double sumaNotas = 0;
        for (int nota : notas) {
            sumaNotas += nota;
        }
        return sumaNotas / notas.size();
    }

}

//    public double notaFinal(String nombreAlumno) {
//    Optional<Alumno> optionalAlumno = listaAlumnos.stream()
//            .filter(alumno -> alumno.getNombre().equalsIgnoreCase(nombreAlumno))
//            .findFirst();
//
//    if (optionalAlumno.isPresent()) {
//        ArrayList<Integer> notas = optionalAlumno.get().getNotas();
//        double promedioFinal = notas.stream().mapToInt(Integer::intValue).average().getAsDouble();
//        return promedioFinal;
//    } else {
//        System.out.println("El alumno no se encuentra en la lista.");
//        return 0;
//    }
//}

