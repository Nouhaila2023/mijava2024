package Nouhaila_Openwebinars.EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

/*Escribe un programa que cuente y muestre 
el número de dígitos de un número entero positivo. */

public class while2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int contador = 0;
        

        System.out.println("El numero que quieres: ");
        numero = Integer.parseInt(sc.nextLine());


        if (numero < 0) {
                System.out.println("Tienes que entrar numeros positivos");
                return;
            }


        while (numero > 0) {
            
            numero = numero / 10;
            contador++; 
        }
            
            
        System.out.println("El numero tiene "+ contador );

        sc.close();
        
       
    }
}
