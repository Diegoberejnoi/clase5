/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Realizar un programa que simule el funcionamiento de un dispositivo
        RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
        cadenas deben llegar con un formato fijo: tienen que ser de un máximo
        de 5 caracteres de largo, el primer carácter tiene que ser X y el último
        tiene que ser una O.
        Las secuencias leídas que respeten el formato se consideran correctas,
        la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
        FDE), y toda secuencia distinta de FDE, que no respete el formato se
        considera incorrecta.
        Al finalizar el proceso, se imprime un informe indicando la cantidad de
        lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
        deberá investigar cómo se utilizan las siguientes funciones de Java
        Substring(), Length(), equals().
        */
        
        Scanner leer = new Scanner(System.in);
        
        String cadena;
        int correcto=0, incorrecto=0;
        
        do {
            System.out.println("Ingrese una frase de 5 caracteres");
            cadena = leer.nextLine();
            
            //Verificacion de longitud de frases de 5 caracteres
            while(cadena.length()!=5){
                System.out.println("La frase ingresada no posee 5 caracteres, ingresela de nuevo");
                cadena = leer.nextLine();
            }
            
            if (cadena.equals("&&&&&")) { //si se da esta condicion rompe el bucle
                break;                
            } else if (cadena.substring(0,1).equals("X") && cadena.substring(4).equals("O") ){
                correcto++; //si la primera letra es X y la ultima O agrega un contador de correcto
            } else {
                incorrecto++; //y si no pasa nada de lo anterior la frase es incorrecta
            }
            
        } while (true);
        
        System.out.println("La cantidad de frases correctas ingresadas fueron " + correcto);
        System.out.println("La cantidad de frases incorrectas ingresadas fueron " + incorrecto);
    }
    
}
