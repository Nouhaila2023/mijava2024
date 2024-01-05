package EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

/*
 * Escribe un programa que calcule
 * el factorial de un número entero positivo n.
 */
public class while4 {

    public static void main(String[] args) {

        int numero;
        int factorial = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el numero necisario:");
        numero = Integer.parseInt(sc.nextLine());

        if (numero < 0) {
            System.out.println("Error");
            sc.close();
            return;
        }

        while (numero > 0) {
            factorial *= numero;
            numero--;
        }

        System.out.println("El factorial es: " + factorial);

        sc.close();
        
    }
}
