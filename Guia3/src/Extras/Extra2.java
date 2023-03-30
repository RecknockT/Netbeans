package Extras;
public class Extra2 {
    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int aux = 0;
        
       // cambio
       aux = B;
       B = C;
       C = A;
       A = D;
       D = aux;
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
               
    }
    
}
