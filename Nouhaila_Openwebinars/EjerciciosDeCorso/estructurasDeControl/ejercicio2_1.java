package Nouhaila_Openwebinars.EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

/*
Segundo ejercicio sobre bucles.
● Calcula cuál es el resultado de sumar los `n` primeros números positivos. 
● Introduce el valor de `n` a través del teclado
 */
public class ejercicio2_1 {
    public static void main(String[] args) {
        int n;
        int suma=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el n :");
        n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= n; i++) {
            suma += i;          
        }
        System.out.println("La suma de los "+ n + " Primeros numeros es: " + suma );

        sc.close();
    }
}
