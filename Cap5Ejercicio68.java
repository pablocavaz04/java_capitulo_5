/*
 * 
 * Escribe un programa que pida un número por teclado y que luego lo “disloque” de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
 * es impar. Usa long en lugar de int donde sea necesario para admitir números
 * largos.
 * 
 * Author:Pablo
 * 
 */
import java.util.Scanner;
public class Cap5Ejercicio68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        long numero = sc.nextLong();
        long auxNumero = numero;
        long numeroReves = 0;
        long numerorevesSumado = 0;
        long digito = 0;
        while (numero > 0) {
            numeroReves = ((numeroReves * 10) + (numero % 10));
            numero /= 10;
        }
        while (numeroReves > 0) {
            if (numeroReves % 2 == 0) {
                digito = ((numeroReves % 10) + 1);
                numerorevesSumado = ((numerorevesSumado * 10) + digito);
            } else {
                digito = ((numeroReves % 10) - 1);
                numerorevesSumado = ((numerorevesSumado * 10) + digito);
            }
            numeroReves /= 10;
        }
        System.out.println("Dislocando el " + auxNumero + " sale el " + numerorevesSumado);
        sc.close();
    }
}