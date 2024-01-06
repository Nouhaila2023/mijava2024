package Nouhaila_Openwebinars.EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

/*
 * 
 */
class while6{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;

        System.out.println("Dame el numero: ");
        numero = Integer.parseInt(sc.nextLine());

        while (numero > 0) {
            numero += suma;
            numero--;
        }

        System.out.println("La suma de los numeros son: " + suma);







        sc.close();
    }
}