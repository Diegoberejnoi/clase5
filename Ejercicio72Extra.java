/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7.pkg2extra;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio72Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realice un programa que calcule y visualice el valor máximo, el valor
        mínimo y el promedio de n números (n>0). El valor de n se solicitará al
        principio del programa y los números serán introducidos por el usuario.
        Realice dos versiones del programa, una usando el bucle “while” y otra
        con el bucle “do - while”.
        */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de números que ingresara");
        int n=leer.nextInt(), num, contador=0, max=0, min=0;
        float sum=0;
        
        do {
            contador++;
            System.out.println("Ingrese el " + contador + " numero");
            num=leer.nextInt();
            
            if(contador==1){ //inicializamos en la primera vuelta los valores max, min y sum
                max=num; //como el número ingresado por el usuario
                min=num;
                sum=num;
            } else { //si no es la primera vuelta se suma el número ingresado a sum
                sum+=num;
            }
                
            if(max<num){ //modifica el max por num si es mayor
                max=num;
            }
            if (min>num) { //modifica el min por num si es menor
                min=num;
            }
            
        } while(contador!=n);
       
        System.out.println("El número máximo fue " + max);
        System.out.println("El número mínimo fue " + min);
        System.out.println("El promedio fue " + (sum/n));
    }
    
}
