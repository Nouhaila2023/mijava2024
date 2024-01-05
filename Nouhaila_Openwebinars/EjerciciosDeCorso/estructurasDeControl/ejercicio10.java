package Nouhaila_Openwebinars.EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

/*
 * Escribe un programa en Java que comprueba si un año es bisiesto o no. 
 * Recuerda que los años bisiestos son aquellos que son divisibles entre 4 
 * pero que no son divisibles entre 100, o que son divisibles entre 400.
 */
public class ejercicio10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int añoBisiesto;

        System.out.println("EL año:");
        añoBisiesto = Integer.parseInt(sc.nextLine());

        if (añoBisiesto % 4 == 0 && !(añoBisiesto % 100 == 0 ) || añoBisiesto % 400 ==0) {
            System.out.println( añoBisiesto + " : Es año Bisiesto");
        }else{
             System.out.println( añoBisiesto + " : no es año Bisiesto");
        }
        sc.close();
    }
}
