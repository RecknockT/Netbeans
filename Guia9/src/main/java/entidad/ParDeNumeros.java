package entidad;

// @author Ale Funes

import java.util.Random;

public class ParDeNumeros {
    private final Random rnd = new Random();
    private double n1;
    private double n2;

    public ParDeNumeros() {
        this.n1 = 4*rnd.nextDouble();
        this.n2 = 4*rnd.nextDouble();
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "ParDeNumeros{" + "n1=" + n1 + ", n2=" + n2 + '}';
    }
    
}
