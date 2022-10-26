/*
 * Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.
 */
import java.util.Scanner;
public class Cap5Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int num = sc.nextInt();
        boolean siPrimo = true;
        for (int i=2; i<num;i++){
            if((num%i)==0){
                siPrimo=false;
            }
        }
        if (siPrimo){
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }


    }
}
