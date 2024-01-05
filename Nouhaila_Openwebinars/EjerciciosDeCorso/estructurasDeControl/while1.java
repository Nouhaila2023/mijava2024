package EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

/*
 * Escribe un programa que sume todos los números enteros positivos menores que un número n dado. 
 * Utiliza un bucle while para realizar la suma
 */
public class while1 {
    public static void main(String[] args) {

        int n;
        int suma =0;

        Scanner sc = new Scanner(System.in);

        System.out.println(" Entla el numero N :");
        n = Integer.parseInt(sc.nextLine());

        while (n > 0) {
            suma += n;  
            n--;
        }

        System.out.println( "La suma de el numero 'n' es: " + suma);

        sc.close();
        
    } 
}
