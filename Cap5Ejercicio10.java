/*
 * Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.
* Author:Pablo Camino Vázquez
 */




CON BUCLE D0-WHILE
/*
import java.util.Scanner;
public class Cap5Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int i = 0;
        int num = 0;
        do {
            
            System.out.println("Introduzca el numero "+(i+1)+" :");
            num = sc.nextInt();
            if(num>=0){
                suma = suma+num;
                i++;
            }
        } while (num >= 0);
        if(i>0)
            System.out.println("Tu media total es de "+((double)suma/i));
        else{
            System.out.println("No ha introducido ninguna nota");
        }
    }
}*/


//CASO WHILE
import java.util.Scanner;
public class Cap5Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float suma = 0;
        float i = 0;
        float num = 0;
        while (num >= 0){
            suma += num;
            i++;
            System.out.println("Introduzca el num "+i+" :");
            num =  sc.nextInt();
        }
        System.out.println("Tu media total es de "+(suma/(i-1)));
        sc.close();
    }
}
