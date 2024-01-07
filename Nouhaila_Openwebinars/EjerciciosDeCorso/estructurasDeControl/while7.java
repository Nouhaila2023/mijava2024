package Nouhaila_Openwebinars.EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

/*
 * Escribe un programa que cuente y muestre la cantidad de 
 * dígitos de un número entero ingresado por el usuario
 */

public class while7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero;
        int contador = 0;

        System.out.println("dame el numero:");
        numero = Integer.parseInt(sc.nextLine());

        while (numero > 0) {
            numero /= 10; 
            contador++;
        }

        System.out.println("El total de dijitos es: " + contador);

        sc.close();

    }
}
