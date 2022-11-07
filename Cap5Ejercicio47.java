/* Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han encargado realizar un programa que pinte un 8 por pantalla usando la letra M. Se pide al usuario la altura, que debe ser un número entero impar mayor o igual que 5. Si el número introducido no es correcto, el programa deberá mostrar un mensaje de error. A continuación se muestran algunos ejemplos. La anchura de la figura siempre será de 6 caracteres. Author: Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Cap5Ejercicio47 {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduzca la altura: ");
        int n = sc.nextInt();

        if (n % 2 == 0){
            System.out.println("Introduzcabien los valores");
        } else if (n < 5 ){
            System.out.println("Introduzca bien los valores");
        } else{
            System.out.print("MMMMMM");
            System.out.println("");
            
            for(int i = 1; i <= n/3; i++){
                System.out.print("M");
                for (int asteriscos = 1; asteriscos < 5 ; asteriscos ++){
                    System.out.print(" ");
                }
                System.out.print("M");
                System.out.println("");
            }
            System.out.print("MMMMMM");
            System.out.println("");
    
            for(int i = 1; i <= n/3; i++){
                System.out.print("M");
                for (int asteriscos = 1; asteriscos < 5 ; asteriscos ++){
                    System.out.print(" ");
                }
                System.out.print("M");
                System.out.println("");
            }
            System.out.print("MMMMMM");
            System.out.println("");
        }
    }
}