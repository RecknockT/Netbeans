package Entidad;

import java.util.Random;

/**
 * @author SashaGameDC@gmail.com
 */
public class Sopa {
    
    private String[][] matriz;
    private String[][] mFantasma;
    private int dificultad;
    
    //CONSTRUCTORES//
    public Sopa() {
        this.matriz = crearMatriz();
        this.mFantasma = new String[20][20];
    }

    public Sopa(String[][] matriz,String[][] mFantasma, int dificultad) {
        this.matriz = crearMatriz();
        this.mFantasma = new String[20][20];
        this.dificultad = dificultad;
    }
    
    //SETTERS//
    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public void setmFantasma(String[][] mFantasma) {
        this.mFantasma = mFantasma;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
    
    //GETTERS//
    public String[][] getMatriz() {
        return matriz;
    }

    public String[][] getmFantasma() {
        return mFantasma;
    }

    public int getDificultad() {
        return dificultad;
    }
    
    //METODOS//
    private String[][] crearMatriz(){
        
        Random rad = new Random();
        String[][] sopa = new String[20][20];
        
        for (int i = 0; i < 20; i++){
            
            for (int j = 0; j < 20; j++){
                
                int NA = rad.nextInt(20);
                switch(NA){
                    
                    case 0:
                        sopa[i][j] = "a";
                        break;
                    case 1:
                        sopa[i][j] = "b";
                        break;
                    case 2:
                        sopa[i][j] = "c";
                        break;
                    case 3:
                        sopa[i][j] = "d";
                        break;
                    case 4:
                        sopa[i][j] = "e";
                        break;
                    case 5:
                        sopa[i][j] = "f";
                        break;
                    case 6:
                        sopa[i][j] = "g";
                        break;
                    case 7:
                        sopa[i][j] = "i";
                        break;
                    case 8:
                        sopa[i][j] = "j";
                        break;
                    case 9:
                        sopa[i][j] = "l";
                        break;
                    case 10:
                        sopa[i][j] = "m";
                        break;
                    case 11:
                        sopa[i][j] = "n";
                        break;
                    case 12:
                        sopa[i][j] = "o";
                        break;
                    case 13:
                        sopa[i][j] = "p";
                        break;
                    case 14:
                        sopa[i][j] = "q";
                        break;
                    case 15:
                        sopa[i][j] = "r";
                        break;
                    case 16:
                        sopa[i][j] = "s";
                        break;
                    case 17:
                        sopa[i][j] = "t";
                        break;
                    case 18:
                        sopa[i][j] = "u";
                        break;
                    case 19:
                        sopa[i][j] = "v";
                        break;
                }
            }
        }
        return sopa;
    }
}