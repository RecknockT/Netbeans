package ejer;

//@author Ale Funes
import entidad.Cafetera;
import servicio.CafeteraServicio;

public class Ejer2 {

    public static void main(String[] args) throws InterruptedException {
        CafeteraServicio s1 = new CafeteraServicio();
        Cafetera cafe = s1.crearCafetera();
        s1.menuCafetera(cafe);
    }

}
