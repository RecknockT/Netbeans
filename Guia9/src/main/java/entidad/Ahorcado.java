package entidad;

// @author Ale Funes
public class Ahorcado {
    private char [] frase;
    private boolean[] letrasDescubiertas;
    private int longitud;
    private int letrasEncontradas;
    private int letrasFaltantes;
    private int oportunidades;

    public Ahorcado() {
         this.frase= null;
         this.letrasDescubiertas = null;
        this.letrasEncontradas = 0;
        this.letrasFaltantes = 0;
        this.oportunidades = 0;
    }

    public Ahorcado(char[] frase, int oportunidades) {
        this.frase = frase;
        this.letrasEncontradas = 0;
        this.longitud = frase.length;
        this.letrasFaltantes = frase.length;
        this.oportunidades = oportunidades;
    }

    public boolean[] getLetrasDescubiertas() {
        return letrasDescubiertas;
    }

    public void setLetrasDescubiertas(boolean[] letrasDescubiertas) {
        this.letrasDescubiertas = letrasDescubiertas;
    }


    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public char[] getFrase() {
        return frase;
    }

    public void setFrase(char[] frase) {
        this.frase = frase;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getLetrasFaltantes() {
        return letrasFaltantes;
    }

    public void setLetrasFaltantes(int letrasFaltantes) {
        this.letrasFaltantes = letrasFaltantes;
    }

    public int getOportunidades() {
        return oportunidades;
    }

    public void setOportunidades(int oportunidades) {
        this.oportunidades = oportunidades;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "frase=" + frase + ", letrasEncontradas=" + letrasEncontradas + ", letrasFaltantes=" + letrasFaltantes + ", oportunidades=" + oportunidades + '}';
    }
    
}
