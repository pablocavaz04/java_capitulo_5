
/*
 * Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).
* Author:Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Cap5Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero : ");
        int num = sc.nextInt();
        for (int i=1; i<=100; i++){
            num= num+1;
            System.out.println(num);
            }
    }
}
