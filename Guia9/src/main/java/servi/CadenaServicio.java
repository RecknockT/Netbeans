package servi;

// @author Ale Funes
import entidad.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    private final Scanner leer = new Scanner(System.in);

    public Cadena crearCadena() {
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        return new Cadena(frase);
    }

    public void mostrarVocales(Cadena f1) {
        String vocales = f1.getFrase().replaceAll("[aeiouAEIOU]", "");
        System.out.println("La frase contiene una cantidad de vocales de; " + (f1.getFrase().length() - vocales.length()));
    }

    public void invertirFrase(Cadena f1) {
        StringBuilder sb = new StringBuilder(f1.getFrase());
        sb.reverse();
        f1.setFrase(sb.toString());
        System.out.println(f1.getFrase());
    }

    public void vecesRepetido(String p1, Cadena f1) {
        String letra = f1.getFrase().replaceAll(p1, "");
        System.out.println("La frase la contiene una cantidad de veces de: " + (f1.getFrase().length() - letra.length()));
    }

    public void compararLongitud(String p1, Cadena f1) {
        if (p1.length() == f1.getLongitud()) {
            System.out.println("Frases de igual longitud");
        } else {
            System.out.println("Frases de desigual longitud");
        }
    }

    public void unirFrases(String p1, Cadena f1) {
        String nf = f1.getFrase().concat(" " + p1);
        System.out.println(nf);
    }

    public void reemplazar(String p1, Cadena f1) {
        System.out.println(f1.getFrase().replaceAll("a", p1));
    }

    public boolean contiene(String p1, Cadena f1) {
        return f1.getFrase().contains(p1);
    }

    public void mostrarMenu(Cadena cadena) {
        int opcion = 0;
        while (opcion != 9) {
            System.out.println("----- MENU CADENA -----");
            System.out.println("2. Mostrar cantidad de vocales");
            System.out.println("3. Invertir frase");
            System.out.println("4. Contar veces que se repite una letra");
            System.out.println("5. Comparar longitud con otra frase");
            System.out.println("6. Unir frases");
            System.out.println("7. Reemplazar letra");
            System.out.println("8.Contiene la letra en la frase");
            System.out.println("9. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = leer.nextInt();
            leer.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 2:
                    if (cadena != null) {
                        mostrarVocales(cadena);
                    } else {
                        System.out.println("Debe crear una cadena primero.");
                    }
                    break;
                case 3:
                    if (cadena != null) {
                        invertirFrase(cadena);
                    } else {
                        System.out.println("Debe crear una cadena primero.");
                    }
                    break;
                case 4:
                    if (cadena != null) {
                        System.out.print("Ingrese la letra a contar: ");
                        String letra = leer.nextLine();
                        vecesRepetido(letra, cadena);
                    } else {
                        System.out.println("Debe crear una cadena primero.");
                    }
                    break;
                case 5:
                    if (cadena != null) {
                        System.out.print("Ingrese la otra frase: ");
                        String otraFrase = leer.nextLine();
                        compararLongitud(otraFrase, cadena);
                    } else {
                        System.out.println("Debe crear una cadena primero.");
                    }
                    break;
                case 6:
                    if (cadena != null) {
                        System.out.print("Ingrese la otra frase: ");
                        String otraFrase = leer.nextLine();
                        unirFrases(otraFrase, cadena);
                    } else {
                        System.out.println("Debe crear una cadena primero.");
                    }
                    break;
                case 7:
                    if (cadena != null) {
                        System.out.print("Ingrese la letra a reemplazar: ");
                        String letra = leer.nextLine();
                        reemplazar(letra, cadena);
                    } else {
                        System.out.println("Debe crear una cadena primero.");
                    }
                    break;
                case 8:
                    if (cadena != null) {
                        System.out.print("Ingrese la subcadena a buscar: ");
                        String subcadena = leer.nextLine();
                        boolean contieneSubcadena = contiene(subcadena, cadena);
                        System.out.println("La cadena contiene la subcadena: " + contieneSubcadena);
                    } else {
                        System.out.println("Debe crear una cadena primero.");
                    }
                    break;
                case 9:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }
}
