package servicio;

// @author Ale Funes
import entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {

    private Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = leer.nextInt();
        char sexo;
        do {
            System.out.println("Ingrese el sexo (H/M/O): ");
            sexo = leer.next().toUpperCase().charAt(0);
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');

        System.out.println("Ingrese el peso: ");
        double peso = leer.nextDouble();

        System.out.println("Ingrese la altura: ");
        double altura = leer.nextDouble();
        leer.nextLine();
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public boolean esMayorDeEdad(Persona p1) {
        return p1.getEdad() > 18;
    }

    public int calcularIMC(Persona p1) {
        double imc = p1.getPeso() / (p1.getAltura() * p1.getAltura());
        if (imc < 20) {
            return -1;
        } else if (imc > 19 && imc < 26) {
            return 0;
            
        } else {
            return 1;
        }
    }
    public void mostrar (Persona p1){
        System.out.println(p1.toString());
    }
}
