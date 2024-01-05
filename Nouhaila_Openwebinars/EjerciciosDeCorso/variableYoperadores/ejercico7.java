package Nouhaila_Openwebinars.EjerciciosDeCorso.variableYoperadores;

import java.util.Scanner;

/**
* Escribe un programa que lea dos números enteros por teclado, y realice las operaciones básicas de una 
* calculadora con ellos: suma, resta, multiplicación, división y resto. 
* Debe mostrar todos los resultados por consola.
*/
public class ejercico7 {
    public static void main(String[] args) {
        double numero1;
        double numero2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el premer numero: ");
        numero1 = Double.parseDouble(sc.nextLine());
        System.out.println(numero1);

        System.out.println("Dime el segundo numero: ");
        numero2 = Double.parseDouble(sc.nextLine());
        System.out.println(numero2);

        double suma = numero1 + numero2;
        double resto = numero1 - numero2;
        double multiplicasion = numero1 * numero2;
        double debercion = numero1 / numero2;
        double resta = numero1 % numero2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resto es: " + resto);
        System.out.println("La multiplicasion es: " + multiplicasion);
        System.out.println("La debesion es: " + debercion);
        System.out.println("La resta es: " + resta);
        sc.close();


    }
}
