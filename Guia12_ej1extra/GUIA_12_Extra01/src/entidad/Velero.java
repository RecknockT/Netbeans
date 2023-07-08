package entidad;

public class Velero extends Barco {

    private int mastiles;

    public Velero(int mastiles, String matricula, Integer anioFabricacion, double eslora) {
        super(matricula, anioFabricacion, eslora);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
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

    @Override
    public String toString() {
        return  "Velero{" + "mastiles=" + mastiles + super.toString()+'}';
    }
    
    
    

    @Override
    public double calcularModulo() {
        return 10*eslora+mastiles;   
    }
}
