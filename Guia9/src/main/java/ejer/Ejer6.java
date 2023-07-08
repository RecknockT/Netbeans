package ejer;

//@author Ale Funes

import entidad.Curso;
import servi.CursoServicio;



public class Ejer6 {

    public static void main(String[] args) {
    CursoServicio s1 = new CursoServicio();
    Curso c1 = s1.crearCurso();
    System.out.println("Las ganancias semanal sera de "+s1.calcularGanancias(c1));
    }

}
