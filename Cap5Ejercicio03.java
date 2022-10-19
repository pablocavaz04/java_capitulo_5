/*
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 * Author:Pablo Camino Vázquez
 */
public class Cap5Ejercicio03 {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        do {
            System.out.println(n*i);
            i++;
        } while (i<=20);
    }
}
