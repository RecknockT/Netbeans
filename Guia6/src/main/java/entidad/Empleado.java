

package entidad;

// @author Ale Funes
public class Empleado {
    private String nombre;
    private double edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nomobre, double edad, double salario) {
        this.nombre = nomobre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nomobre) {
        this.nombre = nomobre;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + '}';
    }
    
}
