/*
 * Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
*
* Author:Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Cap5Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passwd = 2004;
        boolean acierto = false;
        for (int i=1; i<=4 && !acierto; i++){
            System.out.println("Introduzca la contraseña: ");
        int try_ = sc.nextInt();
            if (try_ == passwd){
                System.out.println("La caja fuerte se ha abierto correctamente!!!");
                acierto = true;
            }else{
                System.out.println("Lo siento, esa no es la combinación");
            }
        }
    }
}
