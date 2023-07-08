package entidades;

public class Libro {

    private String titulo, autor;
    private Integer ejemp, ejempPrest;

    public Libro(String titulo, String autor, Integer ejemp) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemp = ejemp;
        this.ejempPrest = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getEjemp() {
        return ejemp;
    }

    public void setEjemp(Integer ejemp) {
        this.ejemp = ejemp;
    }

    public Integer getEjempPrest() {
        return ejempPrest;
    }

    public void setEjempPrest(Integer ejempPrest) {
        this.ejempPrest = ejempPrest;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ejemp=" + ejemp + ", ejempPrest=" + ejempPrest + '}';
    }
    
    
}
