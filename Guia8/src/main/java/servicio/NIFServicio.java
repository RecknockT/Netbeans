package servicio;

// @author Ale Funes

import entidad.NIF;
import java.util.Scanner;

public class NIFServicio {
    private static final char[] LETRAS_DNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    private final Scanner leer = new Scanner(System.in);
    public NIF crearNIF(){
        System.out.println("Ingrese su dni");
        long dni = leer.nextLong();
        int aux = (int) dni%23;
        return new NIF(dni,LETRAS_DNI[aux]);
    }
    public void mostrar(NIF n1){
        System.out.println(n1.toString());
    }
            
}
