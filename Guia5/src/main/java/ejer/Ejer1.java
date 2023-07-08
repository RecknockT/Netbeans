package ejer;

//@author Ale Funes
public class Ejer1 {

    public static void main(String[] args) {
        int[] vector = new int[100];
        for (int i = 100; i > 0; i--) {
            vector[i - 1] = i;
            System.out.println(vector[i - 1]);
        }

    }

}
