/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11extra;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio11Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Escribir un programa que lea un número entero y devuelva el número de
        dígitos que componen ese número. Por ejemplo, si introducimos el
        número 12345, el programa deberá devolver 5. Calcular la cantidad de
        dígitos matemáticamente utilizando el operador de división. Nota:
        recordar que las variables de tipo entero truncan los números o
        resultados.
        */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int num = leer.nextInt(), cifras=0, aux;
        aux=num;
        
        do {
            aux/=10; //divide el número por 10 y lo trunca, es decir le borra el ultimo digito
            cifras++; //cuenta cuantas cifras fue borrando
        } while(aux!=0);
        
        System.out.println("El número " + num + " tiene " + cifras + " cifras");
    }
    
}
