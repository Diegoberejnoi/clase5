/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5extra;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio5Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Una obra social tiene tres clases de socios:
        ○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
        descuento en todos los tipos de tratamientos.
        ○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
        descuento para los mismos tratamientos que los socios del tipo A.
        ○ Los socios que menos aportan, los de tipo ‘C’, no reciben
        descuentos sobre dichos tratamientos.
        ○ Solicite una letra (carácter) que representa la clase de un socio, y
        luego un valor real que represente el costo del tratamiento (previo
        al descuento) y determine el importe en efectivo a pagar por dicho
        socio.
        */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su categoría");
        char cat = leer.next().charAt(0);
        float coste;
        
        switch(cat) {
            case 'A':
                System.out.println("Ingrese el coste del tratamiento");
                coste= leer.nextFloat();
                System.out.println("Usted debe pagar " + (coste*0.5));
                break;
            case 'B':
                System.out.println("Ingrese el coste del tratamiento");
                coste= leer.nextFloat();
                System.out.println("Usted debe pagar " + (coste*0.65));
                break;
            case 'C':
                System.out.println("Ingrese el coste del tratamiento");
                coste= leer.nextFloat();
                System.out.println("Usted debe pagar " + coste);
                break;
            default:
                System.out.println("La opción ingresada no es valida");
                        
        }
                
    }
    
}
