package ejer;

//@author Ale Funes
import java.util.Scanner;

public class Extra7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de términos de la sucesión de Fibonacci a calcular: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("La sucesión de Fibonacci de " + n + " términos es:"+"1");
            System.exit(0); // Salimos del programa

        }
        int[] fibonacci = new int[n];

        // Asignar los primeros dos números de la sucesión
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        // Calcular los siguientes números de la sucesión y almacenarlos en el vector
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Imprimir la sucesión de Fibonacci
        System.out.println("La sucesión de Fibonacci de " + n + " términos es:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }

}
