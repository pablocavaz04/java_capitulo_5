/*
 * Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés
 * Author: Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Cap5Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        long n = sc.nextLong();
        long aux= n;
        long volteado = 0;
        while (n>0){
            volteado=volteado*10+n%10;
            n/=10;
        }
        System.out.printf("El numero introducido %d y al reves es %d",aux,volteado);
    }
    
}
