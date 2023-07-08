
package ejer;

//@author Ale Funes

import entidad.CuentaBancaria;
import servicio.CuentaBancariaServicio;
import java.util.Scanner;

public class Ejer1 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio s1 = new CuentaBancariaServicio();
        CuentaBancaria cuenta = s1.crearCuenta();
        System.out.println("Ingrese contraseña");
        String contra = leer.next();
        if (cuenta.getContrasena().equals(contra)) {
            s1.menuCajero(cuenta);
        }
        
    }

}
