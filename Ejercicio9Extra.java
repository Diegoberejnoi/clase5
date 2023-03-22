/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9extra;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio9Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Simular la división usando solamente restas. Dados dos números enteros
        mayores que uno, realizar un algoritmo que calcule el cociente y el
        residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
        obtener un resultado menor que el divisor, este resultado es el residuo, y
        el número de restas realizadas es el cociente.
        Por ejemplo: 50 / 13:
        50 – 13 = 37 una resta realizada
        37 – 13 = 24 dos restas realizadas
        24 – 13 = 11 tres restas realizadas
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
        3.
        ¿Aún no lo entendiste? Recomendamos googlear división con restas
        sucesivas.
        */
        
        Scanner leer = new Scanner(System.in);
        int dividendo, divisor, residuo, cociente=0;
        
        System.out.println("Ingrese número que desea dividir");
        dividendo = leer.nextInt();
        
        while(dividendo<=1){
            System.out.println("Usted ingreso un número menor o igual que 1, intente de nuevo");
            dividendo = leer.nextInt();
        }
        
        residuo=dividendo;
        
        System.out.println("Ingrese el número por el que desea divir");
        divisor = leer.nextInt();
        
        while(divisor<=1){
            System.out.println("Usted ingreso un número menor o igual que 1, intente de nuevo");
            divisor = leer.nextInt();
        }
        
        do {
            residuo-=divisor;
            cociente++;            
        } while(residuo>=divisor);
        
        System.out.println(dividendo + " / " + divisor + " = " + cociente + " y resto " + residuo);
    }
    
}
