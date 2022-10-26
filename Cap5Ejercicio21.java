/*
Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.
 */
import java.util.Scanner;
public class Cap5Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float i = 0;
        float par = 0;
        float impar = 0;
        float num = 1;
        int contimpar = 0;
        while(num > 0){
            i++;
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
            if ((num/2)!=0){
                contimpar++;
                impar=impar+num;
            }else{
                if(num>par){
                    par=num;
                }
            }
        }
        System.out.println("La cantidad de numeros introducidos es:"+i);
        System.out.println("La media de los numeros impares es :"+(impar/contimpar));
        System.out.println("El numero par introducido mas grande es: "+par);
    }
}
