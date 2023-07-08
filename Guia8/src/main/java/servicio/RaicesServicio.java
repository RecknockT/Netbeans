package servicio;

// @author Ale Funes
import entidad.Raices;
import java.util.Scanner;

public class RaicesServicio {

    private Scanner leer = new Scanner(System.in);

    public Raices crearRaices() {
        System.out.println("Ingrese a");
        double a = leer.nextDouble();

        System.out.println("Ingrese a");
        double b = leer.nextDouble();

        System.out.println("Ingrese a");
        double c = leer.nextDouble();
        return new Raices(a, b, c);
    }
    public double getDiscriminante(Raices r1){
        return (r1.getB()*r1.getB())-4*r1.getA()*r1.getC();
    }
    public boolean tieneRaices(Raices r1){
        return getDiscriminante(r1) > 0;
    }
    public boolean tieneRaiz(Raices r1){
        return getDiscriminante(r1) == 0;
    }
    public void obtenerRaices(Raices r1){
        if (tieneRaices(r1)) {
            System.out.println(-r1.getB()+Math.sqrt(getDiscriminante(r1)/(2*r1.getA())));
            System.out.println(-r1.getB()-Math.sqrt(getDiscriminante(r1)/(2*r1.getA())));
        }
    }
    public void ObtenerRaiz(Raices r1){
        if(tieneRaiz(r1)){
            System.out.println(-r1.getB() / (2 * r1.getA()) );
    }
    }
    public void calcular(Raices r1){
        if (tieneRaices(r1)) {
        obtenerRaices(r1);
        }else if (tieneRaiz(r1)) {
        ObtenerRaiz(r1);
        }else{
            System.out.println("No tiene solucion real");
        }
    }
}
