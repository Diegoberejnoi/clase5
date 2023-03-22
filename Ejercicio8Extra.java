/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8extra;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio8Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escriba un programa que lea números enteros. Si el número es múltiplo
        de cinco debe detener la lectura y mostrar la cantidad de números
        leídos, la cantidad de números pares y la cantidad de números impares.
        Al igual que en el ejercicio anterior los números negativos no deben
        sumarse. Nota: recordar el uso de la sentencia break.
        */
        
        Scanner leer = new Scanner(System.in);
        int num, contPar=0, contImpar=0;
        do{
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            
            while(num<0){ //evalua que el número ingresado no sea negativo
                System.out.println("El número ingresado es incorrecto, intente de nuevo");
                num= leer.nextInt();
            }
            
            //situacion donde primero cuenta y despues evalua si es multiplo de 5 para salir
            //del bucle
            
            if (num%2 == 0){
                contPar++;
            } else {
                contImpar++;
            }
            
            if (num%5 == 0){
                break;
            }
            
            /* situacion donde evalua primero si es multiplo de 5 para salir del bucle
             if (num%5 == 0){
                break;
            }else if (num%2 == 0){
                contPar++;
            } else {
                contImpar++;
            }
            
           
            */
            
            
        } while(true);
        
        System.out.println("Se ingresaron " + contPar + ( " números pares"));
        System.out.println("Se ingresaron " + contImpar + ( " números impares"));
    }
    
}
