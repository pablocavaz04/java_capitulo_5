/*
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 */
import java.util.Scanner;
public class Cap5Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        do { 
        System.out.print("Introuzca el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println("Introduzca dos numero que sean diferentes :)");
        }
        }while (num1 == num2);

        if (num1 > num2){
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }
        
        for(int i=num1; i<=num2; i+=7){
            System.out.print(i+" ,");
        }
    }
}
