/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiaz12;

/**
 *Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 * @author Ale Funes
 */
public class GuiaZ12Ejer2 {

    public static void main(String[] args) {
        int [] zz = new int [10];
        try {
            for (int i = 0; i < 11; i++) {
            zz[i] = i;
        }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fuera de indice");
        }
            
        /*ejer 3
         Scanner leer = new Scanner(System.in);
        String num= "10,5";
        String num2 = "4,2";
        
        try {
            Integer NUM = Integer.parseInt(num);
            Integer NUM2 = Integer.parseInt(num2);
           
            System.out.println(NUM/NUM2);
            
            
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir por cero");
        }catch(Exception e){
            System.out.println("Hizo cualquier cosa");
        }
        */
        
        /*
        ejer 1
          public boolean esMayorDeEdad(Persona p) throws Exception{
        boolean exc = false;
try{
    exc = (p.getEdad() >= 18);
} catch(Exception e)  {
    System.out.println("Error de sistema");
        
        Persona p1 = null;

        try {
            ps.esMayorDeEdad(p1);
        } catch(Exception e){
            System.out.println(e.getMessage());
        */
        
        /*
        ejer 4
        Scanner leer = new Scanner(System.in);
        String num;
        String num2;

        try {
            num = leer.next();
            num2 = leer.next();
            Integer NUM = Integer.parseInt(num);
            Integer NUM2 = Integer.parseInt(num2);

            System.out.println(NUM / NUM2);

        } catch (InputMismatchException e) {
               System.out.println("Ingreso algo mal por teclado");
        }catch(NumberFormatException e){
            System.out.println("No se puede convertir a entero");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        } catch (Exception e) {
            System.out.println("Hizo cualquier cosa");
        */
        /*
        ejer 5 
        Random rnd = new Random();
        Scanner leer = new Scanner(System.in);
        int n1 = rnd.nextInt(500)+1;
        int n2;
        int cont=0;
        System.out.println("El numero es: "+n1);
        
        try{
            do {
            System.out.println("Ingrese el numero correcto");
            n2 = leer.nextInt();
            if (n2 == n1) {
                System.out.println("Correcto");
                
                break;
            }else if(n2>n1){
                System.out.println("El numero ingresado es mayor al propuesto");
                cont++;
            }else if(n2<n1){
                System.out.println("El numero ingresado es menor al propuesto");
                cont++;
            }
                
            System.out.println("Sigue intentando");
            
        } while (true);
        }catch(Exception e){
            cont++;
            System.out.println("Ingreso una letra en vez de un numero");
        }finally{
            System.out.println("Se intento "+cont+" veces adivinar");
        }x
        */
    }
}
