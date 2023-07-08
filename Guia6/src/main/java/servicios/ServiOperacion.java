package servicios;

// @author Ale Funes
import entidad.Operacion;
import java.util.Scanner;

public class ServiOperacion {
    
    private Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion() {
        System.out.println("Ingrese el numero 1");
        double Numero1 = leer.nextDouble();
        System.out.println("Ingreses el numero 2");
        double Numero2 = leer.nextDouble();
        return new Operacion(Numero1, Numero2);
    }
    
    public double sumar(Operacion op) {
        return op.getNumero1() + op.getNumero2();
    }
    
    public double restar(Operacion op) {
        return op.getNumero1() - op.getNumero2();
    }
    
    public double multiplicar(Operacion op) {
        if (op.getNumero1() == 0 || op.getNumero2() == 0) {
            System.out.println("error, no se puede multiplicar por 0");
            return 0;
        } else {
            return op.getNumero1() * op.getNumero2();
        }
    }
    
    public double dividir(Operacion op) {
        if (op.getNumero1() == 0. || op.getNumero2() == 0) {
            System.out.println("error, no se puede dividir por 0");
            return 0;
        } else {
            return op.getNumero1() / op.getNumero2();
        }
    }

    public void menu(Operacion op) {
        int opcion;
        
        do {
            System.out.println("---- MENÚ ----");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multi");
            System.out.println("4. Divi");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + sumar(op));
                    break;
                case 2:
                    System.out.println("La resta es: " + restar(op));
                    break;
                case 3:
                    System.out.println("La multi es: " + multiplicar(op));
                    break;
                case 4:
                    System.out.println("La divi es: " + dividir(op));
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
