package Entidad;

/**
 * @author SashaGameDC@gmail.com
 */
public class Palabra {
    
    private String pa;
    private int pf;
    private int pc;
    
    //CONSTRUCTOR//
    public Palabra() {
    }

    public Palabra(String pa, int pf, int pc) {
        this.pa = pa;
        this.pf = pf;
        this.pc = pc;
    }
    
    //SETTERS//
    public void setPa(String pa) {
        this.pa = pa;
    }

    public void setPf(int pf) {
        this.pf = pf;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }
    
    //GETTERS//
    public String getPa() {
        return pa;
    }

    public int getPf() {
        return pf;
    }

    public int getPc() {
        return pc;
    }  
}