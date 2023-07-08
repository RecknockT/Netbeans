package ejer;

//@author Ale Funes
import entidad.Raices;
import servicio.RaicesServicio;

public class Extra1 {

    public static void main(String[] args) {
        RaicesServicio s1 = new RaicesServicio();
        Raices r1 = s1.crearRaices();
        System.out.println("Discriminante: " + s1.getDiscriminante(r1));
        System.out.println("¿Tiene dos raíces? " + s1.tieneRaices(r1));
        System.out.println("¿Tiene una única raíz? " + s1.tieneRaiz(r1));
        s1.calcular(r1);
    }

}
