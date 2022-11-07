/*
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca
 * Author: Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Cap5Ejercicio20 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el caracter para la pirámide: ");
        String caracter = sc.nextLine();
        System.out.println("Introduzca la altura de la pirámide: ");
        int altura = sc.nextInt();
        for (int i=1;i<=altura;i++){
            for(int espacio=altura-i;espacio>=0;espacio--){
                System.out.print(" ");
            };
            for(int car=1;car<=((2*i)-1);car++){
                System.out.print(caracter);
            }
            System.out.println("");
        }
    } 
}