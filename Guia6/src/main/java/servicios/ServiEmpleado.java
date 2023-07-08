

package servicios;

// @author Ale Funes

import entidad.Empleado;
import java.util.Scanner;

public class ServiEmpleado {
    private Scanner leer = new Scanner(System.in);
    public Empleado CrearEmpleado(){
        System.out.println("Ingrese su nombre");
        String Nombre = leer.nextLine();
        System.out.println("Ingrese su edad");
        int Edad = leer.nextInt();
        System.out.println("Ingrese su salario");
        int Salario =leer.nextInt();
        return new Empleado(Nombre, Edad, Salario);
    }
    
    public void calcular_aumento(Empleado emp1) {
        double aumento;

        if (emp1.getEdad() > 30) {
            aumento = emp1.getSalario() * 0.1;
        } else {
            aumento = emp1.getSalario()* 0.05;
        }

        emp1.setSalario(emp1.getSalario()+aumento);

    }
}
