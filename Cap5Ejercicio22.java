/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * Author: Pablo Camino Vázquez
 * 
 */
import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;
public class Cap5Ejercicio22 {
    public static void main(String[] args) {
        for ( int i= 2; i<=100;i++){
            boolean esprimo=true;
            for(int contador=2;contador<=i/2;contador++){
                if(i%contador == 0){
                    esprimo=false;
                }
            }
            if(esprimo)
            System.out.println(i);
        }
    }
}
