package Nouhaila_Openwebinars.EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("dime el numero ");
        x = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= x; i++) {

            for (int j = 0; j <= x - 1; j++) {
                System.out.println(" ");
            }

                for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
                }
        }

        sc.close();
    
    }
}
