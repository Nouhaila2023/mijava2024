package Nouhaila_Openwebinars.EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

public class ejercicio14 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double numero_primo ;

        System.out.println("Dime el numeero que quieres:");
        numero_primo = Double.parseDouble(sc.nextLine());

        if (numero_primo % numero_primo == 0 || numero_primo % 1 == 0) {
            System.out.println("Le numero " + numero_primo + " Es primo");
        } else {
            System.out.println("No es primo");
        }

        /*boolean esPrimo = true;
        for (int i = 2; i <= numero_primo / 2; i++) {
            if (numero_primo % i == 0) {
                esPrimo = false;
                break;
            }
        }*/

        
        
        //Otra manero




        sc.close();

    }
}
