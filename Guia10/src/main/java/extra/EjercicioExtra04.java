package extra;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class EjercicioExtra04 {

    public static void main(String[] args) {

        HashMap<Integer, String> postales = new HashMap();
        Scanner leer = new Scanner(System.in);

        postales.put(83376, "Alemania");
        postales.put(300, "Andorra");
        postales.put(1430, "Argentina");
        postales.put(5521, "Chipre");
        postales.put(5032, "Suiza");
        postales.put(385336, "Rusia");
        postales.put(53730, "Polonia");
        postales.put(1020, "Malta");
        postales.put(98000, "Monaco");
        postales.put(47892, "San Marino");

        System.out.println(postales);

        System.out.println("Ingrese un codigo postal a buscar.");
        int postal = leer.nextInt();
        boolean esta = false;

        for (Map.Entry<Integer, String> entry : postales.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (key == postal) {
                System.out.println("El pais es " + value);
                esta = true;
            }
        }
        if (!esta) {
            System.out.println("No se encontro el pais.");
        }

        System.out.println("Ingrese un codigo postal para agregar.");
        int agregar = leer.nextInt();
        System.out.println("A que pais pertenece la posta?");
        String pais = leer.next();
        postales.put(agregar, pais);

        Iterator<Map.Entry<Integer, String>> iter = postales.entrySet().iterator();

        for (int i = 0; i < 3; i++) {
            leer = new Scanner(System.in);
            System.out.println("Que pais eliminar");
            pais = leer.next();

            for (Iterator<Map.Entry<Integer, String>> iterator = postales.entrySet().iterator(); iterator.hasNext();) {
                Map.Entry<Integer, String> entry = iterator.next();
                if (entry.getValue().equalsIgnoreCase(pais)) {
                    iterator.remove();
                }
            }

        }
        System.out.println(postales);
        
    }

}
