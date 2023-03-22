/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14extra;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio14Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Se dispone de un conjunto de N familias, cada una de las cuales tiene
        una M cantidad de hijos. Escriba un programa que pida la cantidad de
        familias y para cada familia la cantidad de hijos para averiguar la media
        de edad de los hijos de todas las familias.
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias"); //solicitamos la cantidad de familias
        int nFamilias = leer.nextInt();
        int mHijos,edad, cant=0;
        float sum=0;
        
        for (int i = 0; i < nFamilias; i++) { //va a pedir a cada familia que ingrese la cantidad de hijos
            System.out.println("Ingrese la cantidad de hijos de la familia " + (i+1)); //que tiene
            
            mHijos=leer.nextInt(); 
            cant+=mHijos;//sumamos la cantidad total de hijos para sacar el promedio al final
            
            for (int j = 0; j < mHijos; j++) { //va a solicitar la edad de todos los hijos
                System.out.println("Ingrese la edad del hijo " + (j+1));
                edad=leer.nextInt();
                sum+=edad; //sumamos todas las edades para dividir al final
            }
            
        }
        System.out.println("La edad promedio de los hijos de las " + nFamilias + " es " + (sum/cant));
    }
    
}
