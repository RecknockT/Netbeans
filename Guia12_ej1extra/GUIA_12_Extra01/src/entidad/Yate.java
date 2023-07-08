package entidad;

public class Yate extends Barco {

    private double CV;

    private int camarotes;

    public Yate() {
    }
    
    

    public Yate(double CV, int camarotes, String matricula, Integer anioFabricacion, double eslora) {
        super(matricula, anioFabricacion, eslora);
        this.CV = CV;
        this.camarotes = camarotes;
    }
    
    

    @Override
    public double calcularModulo() {
        return eslora*10+CV+camarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "CV=" + CV + ", camarotes=" + camarotes + super.toString()+ '}';
    }
    
    
}
