package ejer;
import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int n1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero");
        int n2 = leer.nextInt();
        char salir = 'n';
        do {
            System.out.println("\nMenu");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("\nElija una opcion");
            int res = leer.nextInt();
            switch (res) {
                case 1:
                    System.out.println("La suma es:" + (n1 + n2));
                    break;
                case 2:
                    System.out.println("La resta es:" + (n1 - n2));

                    break;
                case 3:
                    System.out.println("La multi es:" + (n1 * n2));

                    break;
                case 4:
                    if (n2 != 0) {
                        System.out.println("La división es: " + (n1 / n2));
                    } else {
                        System.out.println("No es posible dividir por cero");
                    }
                    break;
                case 5:
                    System.out.println("Esta seguro que quiere salir?(S/N)");
                    salir = leer.next().charAt(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (salir != 's' && salir != 'S');
        leer.close();
    }
}
            
    

