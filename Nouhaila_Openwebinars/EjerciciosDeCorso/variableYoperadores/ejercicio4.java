package Nouhaila_Openwebinars.EjerciciosDeCorso.variableYoperadores;

import java.util.Scanner;

/*
 * Área del círculo: A=πr 
   Perímetro : P=2πr
   Escribir un programa que calcule el perímetro y el área de un círculo y la muestre por consola. 
El `radio` del mismo lo puedes proporcionar como un valor inicial de la variable correspondiente.
 */
public class ejercicio4 {
    public static void main(String[] args) {
        double A;
        double P;
        double r;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el radio: ");
        r = Double.parseDouble(sc.nextLine());
        System.out.println(r);

        A = Math.PI * Math.pow(r, 2);
        P =  2 * Math.PI * r;
        System.out.println("El área es: " + A );
        System.out.println("El perimerto es: " + P );
        
        sc.close();

    }

}
