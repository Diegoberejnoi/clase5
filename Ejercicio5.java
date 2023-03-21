/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Escriba un programa en el cual se ingrese un valor límite positivo, y a
        continuación solicite números al usuario hasta que la suma de los
        números introducidos supere el límite inicial.
        */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor limite");
        int limite = leer.nextInt(), suma = 0, num;
        
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            
            suma+=num; // suma = suma+num
                    
        } while (suma <= limite);
        
        System.out.println("La suma resultante es " + suma);
        
    }
    
}
