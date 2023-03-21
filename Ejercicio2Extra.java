/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2extra;

/**
 *
 * @author Diego
 */
public class Ejercicio2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
        diferente a cada una. A continuación, realizar las instrucciones
        necesarias para que: B tome el valor de C, C tome el valor de A, A tome
        el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
        valores finales de cada variable. Utilizar sólo una variable auxiliar.
        */
        int A=1, B=3, C=6, D=8, aux;
        aux=B;
        
         System.out.println("A = " + A);
         System.out.println("B = " + B);
         System.out.println("C = " + C);
         System.out.println("D = " + D);
        
        B=C;
        C=A;
        A=D;
        D=aux;
        
        System.out.println("A = " + A);
         System.out.println("B = " + B);
         System.out.println("C = " + C);
         System.out.println("D = " + D);
       
    }
    
}
