/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1extra;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
        ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
        equivalente: 1 día, 2 horas.
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de minutos");
       
        int minutos=leer.nextInt(), dias, horas;
        
        while (minutos != 0){
            
            dias = minutos/(24*60);
            horas = (minutos%(24*60))/60;
            minutos = (minutos%(24*60)%60);
            
        if (dias == 0 && horas != 0) {
            System.out.println("Los minutos ingresados equivalen a " + horas + "horas y " + minutos + "minutos");
         
        } else if(dias == 0 && horas == 0) {
            System.out.println("Los minutos ingresados no superan la hora y son " + minutos);
        } else  {
            System.out.println("Los minutos ingresados equivalen a " + dias + " dias y " + horas + " horas y " + minutos + " minutos");
        
        }
            System.out.println("Ingrese otra cantidad de minutos");
            minutos = leer.nextInt();
       
        }
        
    }
    
}
