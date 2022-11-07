/*
 * 
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura.
 * 
 * Author: Pablo
 */
import java.util.Scanner;
public class Cap5Ejercicio53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura del triángulo: ");
        int altura = sc.nextInt();
        for ( int i1 = 0 ; i1 < altura ; i1++ ) {
            for ( int i2 = 0 ; i2 < altura - i1 ; i2++ ) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}