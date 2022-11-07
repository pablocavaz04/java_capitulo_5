/*
 * 
 * Escribe un programa que diga si un número introducido por teclado es o no
 * capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 * programa debe aceptar números de cualquier longitud siempre que lo permita
 * el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
 * long en lugar de int ya que el primero admite números más largos.
 * 
 * Author : Pablo
 * 
 */
import java.util.Scanner;
public class Cap5Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        long numero = sc.nextLong();
        long aux = numero;
        long numeroReves = 0;
        while (aux > 0) {
            numeroReves = (numeroReves * 10) + ( aux % 10 );
            aux /= 10;
        }
        if (numero == numeroReves) {
            System.out.println("El numero " + numero + " es capicúa");
        } else {
            System.out.println("El numero " + numero + " no es capicúa" );
        }
        sc.close();
    }
}