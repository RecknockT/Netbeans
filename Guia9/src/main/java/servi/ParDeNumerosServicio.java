package servi;

// @author Ale Funes

import entidad.ParDeNumeros;

public class ParDeNumerosServicio {
    
    public ParDeNumeros crearPar(){
        return new ParDeNumeros();
    }
    public void mostar(ParDeNumeros par){
        System.out.println("Los numeros son:\n"+par.toString());
    }
    public double devolverMayor(ParDeNumeros par){
        return Math.max(par.getN1(), par.getN2());
    }
    public double calcularPotencia(ParDeNumeros par){
        return Math.pow(Math.round(devolverMayor(par)), Math.round(Math.min(par.getN1(),par.getN2())));
    }
    public double calculaRaiz(ParDeNumeros par){
        //double menor = par.getN1() < par.getN2() ? par.getN1() : par.getN2();
        return Math.sqrt(Math.abs(Math.min(par.getN1(),par.getN2())));
        
    }
}
