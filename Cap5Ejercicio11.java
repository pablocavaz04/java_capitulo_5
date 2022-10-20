/*
Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
* Author: Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Cap5Ejercicio11 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca un número: ");
            int n = sc.nextInt();
            System.out.println("|     N      |      N^2     |       N^3    |");
            System.out.println("--------------------------------------------");
            for(int i = n ; i < n+5; i++){
            System.out.println("|     "+i+"      |      "+(i*i)+"      |      "+(i*i*i)+"      |");

        }
    }
}
