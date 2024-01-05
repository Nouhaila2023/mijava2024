package Nouhaila_Openwebinars.EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

/*
 * Ejercicio VIII
Escribe un programa que acepte por teclado una cadena y muestre la cadena inversa.
 */
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena = "";
        String vuelta = "";

        System.out.println("Escribe un mensaje");
        cadena = sc.nextLine();

        for(int i = cadena.length()-1; i >= 0; i--){
            vuelta += cadena.charAt(i);
        }

        System.out.println("cadena original " + cadena);
        System.out.println("la vuelta es " + vuelta);

        sc.close();

    }
}
