/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
        Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
        lo siguiente:
        * * * *
        *     *
        *     *
        * * * *
        */
        
        System.out.println("Ingrese el tamaño del cuadrado");
        int tamaño = leer.nextInt();
        /*
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
              
                if (i == 0 || i == tamaño-1 || j == 0 || j == tamaño-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
             System.out.println("");
            */
        
        for (int i = 0; i < tamaño; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        for (int i = 0; i < tamaño-2; i++) {
            System.out.print("*");
            for (int j = 0; j < tamaño-2; j++) {
                 System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        
        for (int i = 0; i < tamaño; i++) {
            System.out.print("*");
        
        }
        System.out.println("");
        
    }
    
}
