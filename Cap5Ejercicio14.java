/*
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia.
* Author:Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Cap5Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una base: ");
        int base = sc.nextInt();
        System.out.println("Introduzca un exponente: ");
        int expo = sc.nextInt();
        int total1 = 1;

        for (int i=1 ; i<=expo ; i++){
            total1 = total1*base;
        }
        System.out.println(total1);
    }
}
