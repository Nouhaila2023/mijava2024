package Nouhaila_Openwebinars.EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

public interface ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;

        System.out.println("dime el premer numero:");
        numero1 = Integer.parseInt(sc.nextLine());

        System.out.println("dime elsegundo numero:");
        numero2 = Integer.parseInt(sc.nextLine());

        System.out.println("dime el tersero numero:");
        numero3 = Integer.parseInt(sc.nextLine());

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El mayor es premer numero: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El mayor es el sugundo numero: " + numero2);
        } else if (numero3 > numero1 && numero3 > numero2){
            System.out.println("El mayor es el terser numeor: " + numero3);
        }
        sc.close();    
    }
}
