/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12extra;

/**
 *
 * @author Diego
 */
public class Ejercicio12Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
        números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
        aparezca un 3 lo sustituya por una E. Ejemplo:
        0-0-0
        0-0-1
        0-0-2
        0-0-E
        0-0-4
        0-1-2
        0-1-E
        Nota: investigar función equals() y como convertir números a String.
        */
        
        int primero=0, segundo=0, tercero=0;
       
        
         do{  
            if (tercero==10) { //si el tercer valor llega a 10 lo recetea y aumenta 1 
                tercero=0; //el siguiente valor
                segundo++;
            }
            if (segundo==10){ //si el segundo valor llega a 10 lo recetea y aumenta 1 
                segundo=0; //el siguiente valor
                primero++;
            }
            
            
             if (primero==3){ //si es un 3 lo reemplaza por una E
                 System.out.print("E-");
                
            } else{ //sino imprime el número que corresponde
                System.out.print(primero + "-");
             }
             
             if (segundo==3){
                 System.out.print("E-");
                
            } else{
                System.out.print(segundo + "-");
             }
            
             if (tercero==3){
                 System.out.println("E");
                
            } else{
                 System.out.println(tercero);
             }
            
            if (primero==9 && segundo ==9 && tercero==9){ //rompe el bucle al llegar al ultimo valor
                break;
            }
            tercero++;
            
        } while(true);
        
    }
    
}
