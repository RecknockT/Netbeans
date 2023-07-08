package servicio;

// @author Ale Funes
import entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    private final Scanner leer = new Scanner(System.in);

    public Cafetera crearCafetera() {
        return new Cafetera();
    }

    public void llenarCafetera(Cafetera cafe) {
        if (cafe.getCapacidadActual() != cafe.getCapacidadMaxima()) {
            System.out.println("Se esta llenando la cafetera al maximo");
            cafe.setCapacidadActual(cafe.getCapacidadMaxima());
        } else {
            System.out.println("La cafetera ya esta llena");
        }

    }

    public void servirTaza(Cafetera cafe, int taza) throws InterruptedException {
        if (cafe.getCapacidadActual() >= taza) {
            System.out.println("Sirviendo taza");
            Thread.sleep(2000);
            System.out.println("Taza llena");
            cafe.setCapacidadActual(cafe.getCapacidadActual() - taza);
        } else {
            System.out.println("Sirviendo taza");
            Thread.sleep(2000);
            System.out.println("La taza no se pudo llenar, la taza se lleno con:" + cafe.getCapacidadActual());
            cafe.setCapacidadActual(0);
        }
    }

    public void vaciarCafetera(Cafetera cafe) throws InterruptedException {
        System.out.println("Vaciando cafetera");
        Thread.sleep(2000);
        System.out.println("Cafetera vacia");
        cafe.setCapacidadActual(0);
    }

    public void agregarCafe(Cafetera cafe, int mas) {
        if (cafe.getCapacidadActual() + mas <= cafe.getCapacidadMaxima()) {
            cafe.setCapacidadActual(cafe.getCapacidadActual() + mas);

        } else {
            System.out.println("Sobrepasa la capacidad maxima, intente con una cantidad menor");
        }
    }

    public void menuCafetera(Cafetera cafe) throws InterruptedException {
        int opcion;

        do {
            System.out.println(cafe.getCapacidadActual());
            System.out.println("---- MENÚ ----");
            System.out.println("1. llenarCafetera");
            System.out.println("2. servirTaza");
            System.out.println("3. vaciarCafetera");
            System.out.println("4. agregarCafe");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    llenarCafetera(cafe);
                    break;
                case 2:
                    System.out.println("Ingrese la capacidad de la taza en ml");
                    servirTaza(cafe, leer.nextInt());
                    break;
                case 3:
                    vaciarCafetera(cafe);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad a ingresar");
                    agregarCafe(cafe, leer.nextInt());
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
