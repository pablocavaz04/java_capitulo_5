/*
 *  Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado
* Author: Pablo Camin Vázquez
 */

import java.util.Scanner;
public class Cap5Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor introduzca un numero: ");
        int num = sc.nextInt();
        int n1 = 0 ;
        int n2 = 1;
        int aux;

        switch (num){
            case 1:
            System.out.println("0");
            break;

            case 2:
            System.out.println(" 0 1 ");
            break;

            default:
            System.out.print(" 0 ,1");
            while (num > 2){
                aux=n1;
                n1=n2;
                n2=n2+aux;
                System.out.print(" ,"+n2);
                num--;
            }
        }
    }
}
