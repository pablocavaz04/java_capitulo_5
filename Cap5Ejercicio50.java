/**
 * 50 Una empresa de cartelería nos ha encargado un programa para realizar uno de
 * sus diseños. Debido a los acontecimientos que han tenido lugar en Cataluña
 * durante el 2018, han recibido muchos pedidos del cartel que muestra el número
 * 155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
 * usuario se le pedirán dos datos, la altura del cartel y el número de espacios
 * que habrá entre los números. La altura mínima es 5. La anchura de los números
 * siempre es la misma. La parte superior de los cincos también es siempre igual.
 * La parte inferior del 5 sí que varía en función de la altura.
 * 
 * Author: Pablo
 */

import java.util.Scanner;

public class Cap5Ejercicio50 {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la altura (mínimo 5): ");
        int n = sc.nextInt();
        System.out.print("Dime la separación (mínimo 1): ");
        int separacion = sc.nextInt();
        
        for(int i = 1; i<=n;i++){
            System.out.print("*");
            for(int espacios = 1;  espacios <= separacion ; espacios++){
                System.out.print(" ");
            }
            if(i == 1 ||i == 3 || i==n){
                System.out.print("****");
            } else if(i ==2){
                System.out.print("*   ");
            } else if(i > 3 && i < n){
                System.out.print("   *");
            }
            for(int espacios = 1;  espacios <= separacion ; espacios++){
                System.out.print(" ");
            }
            if(i == 1 ||i == 3 || i==n){
                System.out.print("****");
            } else if(i ==2){
                System.out.print("*   ");
            } else if(i > 3 && i < n){
                System.out.print("   *");
            }
            System.out.println("");
        } 
        sc.close();
    }
}