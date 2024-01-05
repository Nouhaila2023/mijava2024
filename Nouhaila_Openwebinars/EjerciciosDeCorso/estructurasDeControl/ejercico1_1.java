package Nouhaila_Openwebinars.EjerciciosDeCorso.estructurasDeControl;
/*
● Primer ejercicio sobre bucles.
● Escribe un programa en Java que acepte por teclado un número 
entero y nos diga la cantidad de dígitos que tiene. 
● Pista: si dividimos un número entre 10 una vez, le quitamos un 
dígito.
○ 1234 / 10 = 123 (división entera)
○ 1 / 10 = 0 (división entera)
 */
import java.util.Scanner;

public class ejercico1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int digitos = 0;

        System.out.println("Dime el numero:");
        numero = Integer.parseInt(sc.nextLine());

        while (numero != 0) {
            numero /= 10;
            digitos++;
        }
        System.out.println("Tiene " + digitos + " Digitos");




        sc.close();
    }
}
