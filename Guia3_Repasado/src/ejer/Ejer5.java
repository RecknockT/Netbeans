package ejer;


import java.util.Scanner;

public class Ejer5 {
    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo");
        int n1 = leer.nextInt();
        int suma = 0;
        int n2 ;
        do {
            System.out.println("Ingrese un numero");
            n2 = leer.nextInt();
            suma += n2;
        } while (suma < n1);
        System.out.println(suma);
    }
    
}
