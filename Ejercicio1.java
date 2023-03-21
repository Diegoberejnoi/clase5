/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que dado un número determine si es par o impar.
        
        //Creamos el scanner para ingresar el número
        Scanner leer = new Scanner(System.in);
        
        //definimos e inicializamos la variable con lo que se leera en el scanner
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        
        
        if (num%2 == 0) { //evaluamos si el número es par
            System.out.println("El número " + num + " par");
        } else { //o impar
            System.out.println("El número " + num + " es impar");
        }
        
    }
    
}
