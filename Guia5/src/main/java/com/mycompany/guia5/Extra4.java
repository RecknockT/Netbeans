
package com.mycompany.guia5;

//@author Ale Funes

import java.util.Scanner;

public class Extra4 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.*/
        
        double [] vec = new double [10];
        Scanner leer = new Scanner(System.in);
        int apro= 0;
        int desa= 0;
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Alumno ["+i+"]");
            int not1 = 0;
            int not2 = 0;
            int not3 = 0;
            int not4 = 0;
            System.out.print("Ingrese Primer trabajo práctico evaluativo: ");
            not1=leer.nextInt();
            System.out.print("Ingrese Segundo trabajo práctico evaluativo: ");
            not2=leer.nextInt();
            System.out.print("Ingrese Primer Integrador: ");
            not3=leer.nextInt();
            System.out.print("Ingrese Segundo Integrador: ");
            not4=leer.nextInt();
           vec[i]= (not1 * 0.10)+(not2 * 0.15)+(not3 * 0.25)+(not4 * 0.50);
           
        }
        for (int i = 0; i < vec.length; i++) {
            System.out.print("["+vec[i]+"]");
            System.out.println("");
            if (vec[i] >= 7) {
                apro++;
            }else{
                desa++;
            }
        }
        System.out.println("Cantidad de APROBADOS: " + apro);
        System.out.println("Cantidad de DESAPROBADOS: " + desa);
        System.out.println("");
        
        
    }

}
