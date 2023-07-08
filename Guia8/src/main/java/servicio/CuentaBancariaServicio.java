
package servicio;

// @author Ale Funes

import java.util.Scanner;
import entidad.CuentaBancaria;
public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese número de cuenta:");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese una nueva contraseña");
        String contrasena = leer.next();
        System.out.println("Ingrese DNI del cliente:");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese saldo actual:");
        double saldoActual = leer.nextDouble();
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual,contrasena);
    }

    public void ingresar(CuentaBancaria cuenta, double cantidad) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidad);
        System.out.println("Ingreso exitoso. Saldo actual: " + cuenta.getSaldoActual());
    }

    public void retirar(CuentaBancaria cuenta, double cantidad) {
        if (cuenta.getSaldoActual() >= cantidad) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
            System.out.println("Retiro exitoso. Saldo actual: " + cuenta.getSaldoActual());
        } else {
            double maxRetiro = cuenta.getSaldoActual();
            cuenta.setSaldoActual(0);
            System.out.println("No se puede retirar la cantidad solicitada. Se ha retirado el máximo posible de: "
                    + maxRetiro + " . Saldo actual: " + cuenta.getSaldoActual());
        }
    }

    public void extraccionRapida(CuentaBancaria cuenta) {
        System.out.println("Se puede retirar hasta " + cuenta.getSaldoActual() * 0.2 + " por extracción rápida.");
        System.out.println("Ingrese la cantidad a retirar:");
        double cantidad = leer.nextDouble();
        if (cantidad <= cuenta.getSaldoActual() * 0.2) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
            System.out.println("Retiro exitoso. Saldo actual: " + cuenta.getSaldoActual());
        } else {
            System.out.println("No se puede retirar la cantidad solicitada. Saldo actual: " + cuenta.getSaldoActual());
        }
    }

    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }
    
    public void menuCajero(CuentaBancaria cuenta){
        int opcion;
        
        do {
            System.out.println("---- MENÚ ----");
            System.out.println("1. Ingresar dinero en caja de ahorro");
            System.out.println("2. Retirar dinero de caja de ahorro");
            System.out.println("3. Extracion rapida de la caja ahorro");
            System.out.println("4. consultar saldo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el dinero");
                    ingresar(cuenta, leer.nextDouble());
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar");
                    retirar(cuenta,leer.nextDouble());
                    break;
                case 3:
                    extraccionRapida(cuenta);
                    break;
                case 4:
                    consultarSaldo(cuenta);
                    break;
                case 5:
                    System.out.println("Saliendo del menú.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 5);
        
    }
    }
    
