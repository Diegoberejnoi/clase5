/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13extra;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio13Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crear un programa que dibuje una escalera de números, donde cada
        línea de números comience en uno y termine en el número de la línea.
        Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
        ingresa el número 3:
        1 
        12
        123
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la escalera");
        int tamaño = leer.nextInt();
        
        for (int i = 0; i < tamaño; i++) { //Este bucle da la cantidad de lineas
            
            for (int j = 0; j <= i; j++) { //Este bucle imprime los números en cada linea
                System.out.print(j+1);
            }
            
            System.out.println("");
            
        }
    }
    
}
