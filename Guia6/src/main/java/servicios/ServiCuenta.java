

package servicios;

// @author Ale Funes

import entidad.Cuenta;
import java.util.Scanner;

public class ServiCuenta {
    private Scanner leer = new Scanner(System.in);
    public Cuenta CrearCuenta(){
        System.out.println("Ingrese el nombre del titular");
        String titular = leer.nextLine();
        System.out.println("Ingrese el monto del saldo de la cuenta");
        Double saldo = leer.nextDouble();
        return new Cuenta(titular, saldo);
    }
    public void retirar_dinero(Cuenta c1) {
        System.out.println("Ingrese el monto a retirar");
        double cantidad = leer.nextDouble();
        if (cantidad <= c1.getSaldo()) {
            c1.setSaldo(c1.getSaldo()-cantidad);
            System.out.println("Saldo restante: "+c1.getSaldo());
        } else {
            System.out.println("No tienes suficiente saldo para retirar $" + cantidad);
        }
    }
}
