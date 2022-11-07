/*
 * 
 * Escribe un programa que calcule el factorial de un número entero
 * leído por teclado.
 * 
 * Author:Pablo Camino Vázquez
 * 
 */
import java.util.Scanner;
public class Cap5Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        int factorial = 1;
        for ( int i = 1 ; i <= numero ; i++ ) {
            factorial = factorial * i;

        }
        System.out.println(factorial);
        sc.close();
    }
}