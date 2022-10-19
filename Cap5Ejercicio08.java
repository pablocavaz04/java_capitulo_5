/*
 * Muestra la tabla de multiplicar de un numero introducido por pantalla
 */
import java.util.Scanner;
public class Cap5Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero del que quieras la tabla de multiplicar:  ");
        int num = sc.nextInt();
        for (int i=0; i<=10; i++){
            System.out.println(num*i);
        }
    }
}
