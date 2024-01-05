package Nouhaila_Openwebinars.EjerciciosDeCorso.variableYoperadores;

import java.util.Scanner;

/**
* Escribe un programa en Java que calcule la media de 3 números que se hayan 
* leído desde el teclado y la muestre por consola.
*/
public class ejercico8 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;
        int resto;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("El premer numero");
        numero1 = Integer.parseInt(sc.nextLine());
        System.out.println(numero1);

        System.out.println("El premer numero");
        numero2 = Integer.parseInt(sc.nextLine());
        System.out.println(numero2);

        System.out.println("El premer numero");
        numero3 = Integer.parseInt(sc.nextLine());
        System.out.println(numero3);

        int suma = (numero1 + numero3 + numero2);

        resto = suma / 3;
        System.out.println("El resto es: " + resto);

        sc.close();




    }
}
