/*
Escribe un programa que permita partir un número introducido por teclado en dos partes. Las posiciones se cuentan de izquierda a derecha empezando por el 1. Suponemos que el usuario introduce correctamente los datos, es decir, el número introducido tiene dos dígitos como mínimo y la posición en la que se parte el número está entre 2 y la longitud del número. No se permite eneste ejercicio el uso de funciones de manejo de String (por ej. para extraersubcadenas dentro de una cadena).
 * Author: Pablo Camino Vázquez
 *
 */

import java.util.Scanner;

public class Cap5Ejercicio43 {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        long numero = sc.nextLong();
        System.out.print("Introduzca un número: ");
        int partir = sc.nextInt();
        
        long aux =numero;
        int cont = 1;
        long auxiliar = 0;

        while (aux >= 10) {
            aux = aux/10;
            cont++;
        }

        if(partir > cont){
            System.out.println("Introduzca los valores correctamente ");
        } else if(partir == cont){
            System.out.println("Introduzca los valores correctamente");
        }  else if (partir < cont){
            for(int i = 0 ; i < cont-partir ; i++){
                auxiliar +=(int)(numero%10)*Math.pow(10,i);
                numero /= 10;
            }

            System.out.println("Los valores son " + numero + " y parte en " +auxiliar);
        }
    }
}