package Nouhaila_Openwebinars.EjerciciosDeCorso.estructurasDeControl;
import java.util.Scanner;

/*
 * Escribe un programa en Java que acepte por teclado
 * un número entero entre 1 y 10 y muestre su tabla de multiplicar.
 */
public class ejercicio6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Dime el numero:");
            numero = Integer.parseInt(sc.nextLine());

        } while (numero < 1 || numero > 10);
        
        System.out.println("Tabla de multiplicar del numero " + numero + " : ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero*i);
        }

        
        sc.close();


        
    }
}
