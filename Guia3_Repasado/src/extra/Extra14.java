
package extra;

//@author Ale Funes
import java.util.Scanner;

public class Extra14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de familias: ");
        int n = scanner.nextInt();

        int totalHijos = 0;
        int totalEdad = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            int m = scanner.nextInt();

            for (int j = 1; j <= m; j++) {
                System.out.print("Ingrese la edad del hijo " + j + ": ");
                int edad = scanner.nextInt();
                totalHijos++;
                totalEdad += edad;
            }
        }

        double mediaEdad = (double) totalEdad / totalHijos;

        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);

        scanner.close();
    }

}
