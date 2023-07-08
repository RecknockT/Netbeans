
package entidad;


/**
 * @author Ale Funes
 */
public class Juego {
   private int win1 = 0;
   private int win2 = 0;

    public Juego() {
    }

    public Juego( int win1, int win2) {
        this.win1 = win1;
        this.win2 = win2;
    }

    public int getWin1() {
        return win1;
    }

    public void setWin1(int win1) {
        this.win1 = win1;
    }

    public int getWin2() {
        return win2;
    }

    public void setWin2(int win2) {
        this.win2 = win2;
    }

    @Override
    public String toString() {
        return "Juego{" +   ", win1=" + win1 + ", win2=" + win2 + '}';
    }
    
    
}
