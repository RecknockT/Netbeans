package entidad;

public class Lancha extends Barco {

    private double CV;

    public Lancha(double CV, String matricula, Integer anioFabricacion, double eslora) {
        super(matricula, anioFabricacion, eslora);
        this.CV = CV;
    }

    @Override
    public double calcularModulo() {
        return eslora*10+CV;
    }

    @Override
    public String toString() {
        return "Lancha{" + "CV=" + CV + super.toString()+ '}';
    }
    
    
}
