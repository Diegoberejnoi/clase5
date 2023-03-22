/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6extra;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio6Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Leer la altura de N personas y determinar el promedio de estaturas que
        se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
        general.
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantas alturas desea ingresar?");
        int num = leer.nextInt(),contador=0;
        float altura, sumBajo=0, sum=0;
        
        for (int i = 0; i < num; i++) {
            
            System.out.println("Ingrese la altura " + (i+1));
            altura = leer.nextFloat();
            
            if (altura<1.6){
                sumBajo+=altura;
                contador++;
            }
            
            sum+=altura;
            
        }
        
        System.out.println("El promedio de altura por debajo de 1.6 es " + (sumBajo/contador));
        System.out.println("El promedio total de altura es " + (sum/num));
    }
    
}
