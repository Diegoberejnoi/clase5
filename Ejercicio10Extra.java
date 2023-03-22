/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10extra;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio10Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realice un programa para que el usuario adivine el resultado de una
        multiplicación entre dos números generados aleatoriamente entre 0 y 10.
        El programa debe indicar al usuario si su respuesta es o no correcta. En
        caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
        su respuesta nuevamente. Para realizar este ejercicio investigue como
        utilizar la función Math.random() de Java.
        */
            Scanner leer = new Scanner(System.in);
        
          //generamos 2 valores entre 0 y 10 con decimales
          double num1 = Math.random() * ( 10 - 0 ), num2 = Math.random() * ( 10 - 0 );
            
          //los redondeamos
          long numero1 = Math.round(num1), numero2 = Math.round(num2);
            
          long mult= numero1*numero2;
          
          //System.out.println(mult); 
          
          int adivinar;
          
          System.out.println("Intente adivinar el número entre 0 y 100");
              adivinar = leer.nextInt();
          
          while (adivinar!=mult){
                System.out.println("Lo sentimos, pero no has adivinado el número, intentalo de nuevo");
                adivinar=leer.nextInt();
            }

          System.out.println("Felicitaciones, has adivinado el número");
          
        
        
    }
    
}
