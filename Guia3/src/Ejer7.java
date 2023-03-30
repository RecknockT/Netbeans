
import java.util.Scanner;

public class Ejer7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int conta = 0;
        int conta1 = 0;
        do {
          System.out.println("Ingrese la cadena");           
        String cadena = leer.next();
            if (cadena.equals("&&&&&")) {
                break;
            }
        if (cadena.length() > 1 && cadena.length() < 6 && cadena.substring(0, 1).equalsIgnoreCase("X") && cadena.substring(cadena.length()-1).equalsIgnoreCase("O")) {
            conta++;
        } else {
            conta1++;
        }  
        } while (true);
        
        System.out.println("correctas: " + conta);
        System.out.println("incorrectas: " + conta1);
        
    }
    
}
