/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;



/**
 *
 * @author Diego
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*
        Realizar un programa que pida dos números enteros positivos por
        teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
        una opción y el programa deberá mostrar el resultado por pantalla y
        luego volver al menú. El programa deberá ejecutarse hasta que se elija la
        opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
        vez de salir del programa directamente, se debe mostrar el siguiente
        mensaje de confirmación: ¿Está seguro que desea salir del programa
        (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
        contrario se vuelve a mostrar el menú.
    */
    
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese 2 numeros enteros");
        int num1 = leer.nextInt(), num2 = leer.nextInt(), opcion;
        float numero1=num1, numero2=num2;
        String confirmacion = "N";
        
        do {
            System.out.println("Seleccione una opción");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            opcion=leer.nextInt();
               
            switch (opcion){
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                break;
                case 4:
                    System.out.println(num1 + " / " + num2 + " = " + (numero1/numero2));
                break;
                case 5:
                    System.out.println("Seguro que desea salir? S/N");
                    confirmacion=leer.next();
                break;
                default:
                    System.out.println("El valor ingresado no es valido");
                            
            }
                
            
        } while (!confirmacion.equalsIgnoreCase("S"));
        
    
    }
    
}
