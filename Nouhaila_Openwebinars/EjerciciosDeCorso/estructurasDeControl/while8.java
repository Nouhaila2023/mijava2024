package Nouhaila_Openwebinars.EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

/*
 * Escribe un programa que solicite al usuario ingresar un número entero y 
 * luego muestre la tabla de multiplicar de ese número del 1 al 10 utilizando un bucle while
 */
public class while8 {
 
    public static void main(String[] args) {

        int numero;
        int multiplicasion = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("dame el numero del tabla que quieres ");
        numero = Integer.parseInt(sc.nextLine());

            for (int i = 1; i <= 10; i++){ 

                multiplicasion = i * numero;
                System.out.println( i + " x " + numero + " = " + multiplicasion);

            }
        sc.close();

    }
}
