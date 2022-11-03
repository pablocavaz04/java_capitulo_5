/*
 * 
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los números desde el 1 al número introducido junto
 * a su factorial.
 * Author:Pablo Camino Vázquez
 * 
 */

import java.util.Scanner;
public class Cap5Ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int numero = sc.nextInt();
        int factorial;
        for ( int i = 1 ; i <= numero ; i++ ) {
            factorial = i;
            for ( int i2 = 2 ; i2 < i ; i2++ ) {
                factorial *= i2;
            }
            System.out.println(i + "! = " + factorial);
        }
        sc.close();
    }
}