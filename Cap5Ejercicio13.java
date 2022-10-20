/*
 * Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.
* Author: Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Cap5Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        for(int i=1; i<=10; i++){
            System.out.println("Introduzca el numero "+1+" : ");
            int num = sc.nextInt();
            if (num>0){
                positivos+=1;
            }else{
                negativos+=1;
            }
        }
        System.out.println("De los 10 numero introducidos : ");
            System.out.println(positivos+" numeros son positivos : "+positivos+"/10");
            System.out.println(negativos+" numeros son negativos : "+negativos+" /10");
    }
}
