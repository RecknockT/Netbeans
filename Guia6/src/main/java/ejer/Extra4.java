
package ejer;

//@author Ale Funes

import entidad.Cuenta;
import servicios.ServiCuenta;

public class Extra4 {

   
    public static void main(String[] args) {
        ServiCuenta s1 = new ServiCuenta();
        Cuenta n1= s1.CrearCuenta();
        s1.retirar_dinero(n1);
        System.out.println(n1);
    }

}
