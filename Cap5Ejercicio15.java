/*
 * Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 2^1, 2^2, 2^3...

 */
import java.util.Scanner;
public class Cap5Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una base: ");
        int base = sc.nextInt();
        System.out.print("Introduzca un exponente: ");
        int expo = sc.nextInt();
        int total1 = 1;

        for (int i=1 ; i<=expo ; i++){
            total1 = total1*base;
            System.out.println(base + " ^ " + i +"= "+total1);
        }
    }
}
