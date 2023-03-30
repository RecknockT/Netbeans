
package Extras;

//@author Ale Funes
public class Extra12 {

   
    public static void main(String[] args) {
    for (int i = 0; i < 1000; i++) {
    String numStr = String.format("%03d", i); // Convertir número a cadena de 3 dígitos
    numStr = numStr.replace("3", "E"); // Reemplazar 3 por E
    
    System.out.println(numStr.charAt(0) + "-" + numStr.charAt(1) + "-" + numStr.charAt(2)); // Imprimir número modificado con guiones
}
    }

}
