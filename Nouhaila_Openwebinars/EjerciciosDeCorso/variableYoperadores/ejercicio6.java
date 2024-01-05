package Nouhaila_Openwebinars.EjerciciosDeCorso.variableYoperadores;

import java.util.Scanner;

/**
* Escribe un programa que determine si un número es par o impar usando el operador ternario
*/
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;

        System.out.println("deme el numero: ");
        numero = Double.parseDouble(sc.nextLine());
        
        System.out.println(numero);

        String determine = (numero % 2 == 0) ? "IMP" : "IMPAR";
        System.out.println("un programa que determine si un número es par o impar: " + determine);
        sc.close();

    }
}
