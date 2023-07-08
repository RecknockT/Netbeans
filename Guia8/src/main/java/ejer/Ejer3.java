package ejer;

//@author Ale Funes
import entidad.Persona;
import servicio.PersonaServicio;

public class Ejer3 {

    public static void main(String[] args) {
        PersonaServicio s1 = new PersonaServicio();
        Persona[] Cuatro = new Persona[4];
        int [] edad =new int [] {0,0};
        int[] imc = new int[]{0,0,0};
        for (int i = 0; i < Cuatro.length; i++) {
            Cuatro[i] = s1.crearPersona();
            s1.mostrar(Cuatro[i]);
            if (s1.esMayorDeEdad(Cuatro[i])) {
                System.out.println("Es mayor");
                edad[0] += 1;
            } else {
                System.out.println("Es menor");
                edad[1] += 1;
            }
            switch (s1.calcularIMC(Cuatro[i])) {
                case -1:
                    System.out.println("Bajo peso");
                    imc[0] += 1; 
                    break;
                case 0:
                    System.out.println("Peso ideal");
                    imc[1] += 1; 
                    break;
                case 1:
                    System.out.println("sobre peso");
                    imc[2] += 1; 
                    break;
            }
        }
        System.out.println("El porcentaje de mayores de edad es de: "+ (edad[0]/4)*100+"%");
        System.out.println("El porcentaje de manores de edad es de: "+ (edad[1]/4)*100+"%");
        System.out.println("El porcentaje de bajo peso es de: " + (imc[0]/4)*100+"%");
        System.out.println("El porcentaje de peso ideal es de: " + (imc[1]/4)*100+"%");
        System.out.println("El porcentaje de sobre peso es de: " + (imc[2]/4)*100+"%");
    }
}
