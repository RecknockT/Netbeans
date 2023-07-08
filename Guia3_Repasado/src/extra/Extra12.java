
package extra;

//@author Ale Funes
public class Extra12 {

   
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            //String.format: Es un método estático de la clase String que se utiliza para formatear una cadena de texto con valores específicos.
            //"%03d": Es una cadena de formato que especifica cómo se debe formatear el número entero i. En este caso, %d indica que se debe reemplazar por un número entero, y 3 indica el ancho mínimo de 3 dígitos.
            //i: Es el número entero que se desea formatear.
            //La combinación de %03d indica que se debe formatear el número con un ancho mínimo de 3 dígitos y rellenar con ceros a la izquierda si es necesario. Por ejemplo, si i es igual a 5, el resultado de String.format("%03d", i) sería la cadena "005". Si i es igual a 12, el resultado sería "012".
            String numStr = String.format("%03d", i); // Convertir número a cadena de 3 dígitos
            numStr = numStr.replace("3", "E"); // Reemplazar 3 por E

            System.out.println(numStr.charAt(0) + "-" + numStr.charAt(1) + "-" + numStr.charAt(2)); // Imprimir número modificado con guiones
        }
    }

}
