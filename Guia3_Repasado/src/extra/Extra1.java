package extra;

import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        System.out.println("Ingrese los minutis");
        int min = leer.nextInt();
        int dias =(int) min / 1440;
        int horas = (int) (min % 1440)/60 ;
        int min1 = (int) min % 60;
        System.out.println("dias " + dias);
        System.out.println("Horas "+ horas);
        System.out.println("min "+ min1);
    }
    
}
