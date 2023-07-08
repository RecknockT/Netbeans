package entidad;


/** 
 * @author Ale Funes
 */
public class Libro {
    private String ISBN;
    private String Titulo;
    private String Autor;
    private int NPaginas;

    public Libro() {
    }

    public Libro(String ISBN, String Titulo, String Autor, int NPagina) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NPaginas = NPagina;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNPaginas() {
        return NPaginas;
    }

    public void setNPaginas(int NPaginas) {
        this.NPaginas = NPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NPaginas=" + NPaginas + '}';
    }
    
    
}


