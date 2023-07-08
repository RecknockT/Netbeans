package ejer;

//@author Ale Funes
import java.util.Random;
import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {
            Random rnd = new Random();
            Scanner leer = new Scanner(System.in);
            String[] vectorMeses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
            String mesSecreto = vectorMeses[rnd.nextInt(12)];
            String mes;
            System.out.println(mesSecreto);
            do {
                System.out.println("Ingrese el mes secreto, en minuscula");
                mes = leer.next().toLowerCase();
            } while (!mes.equals(mesSecreto));
            if (mes.equals(mesSecreto)) {
                System.out.println("Acertaste!!!");
            }
    }

}
