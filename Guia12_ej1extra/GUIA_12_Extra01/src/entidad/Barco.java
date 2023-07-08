package entidad;

public abstract class Barco {

    protected String matricula;

    protected Integer anioFabricacion;

    protected double eslora;

    public Barco() {
    }

    public Barco(String matricula, Integer anioFabricacion, double eslora) {
        this.matricula = matricula;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public abstract double calcularModulo();

    @Override
    public String toString() {
        return "{" + "matricula=" + matricula + ", anioFabricacion=" + anioFabricacion + ", eslora=" + eslora + '}';
    }
    
    
    

}
