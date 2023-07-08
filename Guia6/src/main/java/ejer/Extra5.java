
package ejer;

//@author Ale Funes

import entidad.Empleado;
import servicios.ServiEmpleado;

public class Extra5 {

   
    public static void main(String[] args) {
        ServiEmpleado s1 = new ServiEmpleado();
        Empleado emp1 = s1.CrearEmpleado();
        s1.calcular_aumento(emp1);
        System.out.println(emp1);
    }

}
