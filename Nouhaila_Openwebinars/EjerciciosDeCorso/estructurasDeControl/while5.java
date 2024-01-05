package EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

/*
 * Escribe un programa que sume los dígitos
 * de un número entero positivo n.
 */
public class while5 {
    public static void main(String[] args) {

        int numero;
        int suma = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero:");
        numero = Integer.parseInt(sc.nextLine());

        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }

        System.out.println(suma);

        sc.close();
        
    }
}
