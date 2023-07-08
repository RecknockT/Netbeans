package servicio;

// @author Ale Funes
import entidades.Tienda;
import java.util.HashMap;
import java.util.Scanner;

public class TiendaServicios {

    private Tienda tienda;
    private Scanner scan ;

    public TiendaServicios() {
        this.tienda = new Tienda();
        this.scan = new Scanner(System.in);
    }

    public void agregarProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scan.next();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();
        tienda.getProductos().put(nombre, precio);
        System.out.println("Producto agregado exitosamente.");
    }

    public void modificarPrecioProducto() {
        System.out.print("Ingrese el nombre del producto que desea modificar: ");
        String nombre = scan.next();
        if (tienda.getProductos().containsKey(nombre)) {
            System.out.print("Ingrese el nuevo precio del producto: ");
            double precio = scan.nextDouble();
            tienda.getProductos().replace(nombre, precio);
            System.out.println("Precio del producto modificado exitosamente.");
        } else {
            System.out.println("El producto no se encuentra en la tienda.");
        }
    }

    public void eliminarProducto() {
        System.out.print("Ingrese el nombre del producto que desea eliminar: ");
        String nombre = scan.next();
        if (tienda.getProductos().containsKey(nombre)) {
            tienda.getProductos().remove(nombre);
            System.out.println("Producto eliminado exitosamente.");
        } else {
            System.out.println("El producto no se encuentra en la tienda.");
        }
    }

    public void mostrarProductos() {
        HashMap<String, Double> productos = tienda.getProductos();
        if (productos.isEmpty()) {
            System.out.println("La tienda no tiene productos.");
        } else {
            System.out.println("Productos en la tienda:");
            for (String nombre : productos.keySet()) {
                double precio = productos.get(nombre);
                System.out.println(nombre + ": $" + precio);
            }
        }
    }
    public void menu(){
        boolean salir = false;
        int opcion;
        
        while (!salir) {
            System.out.println("----- MENÚ TIENDA -----");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio de producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scan.nextInt();
            
            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    modificarPrecioProducto();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
            
            System.out.println(); // Salto de línea
        }
        
        System.out.println("¡Hasta luego!");
    }
    
}
