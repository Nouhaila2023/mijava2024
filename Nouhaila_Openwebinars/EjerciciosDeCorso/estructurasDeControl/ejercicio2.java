package EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;
/*
 *  Realiza un programa en Java que, dado un día de la semana como 
un número entero, nos indique el día como texto. 
● Haz dos versiones, una usando switch como expresión y otra como 
sentencia
 */

public class ejercicio2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int dia_semana;

        System.out.println("dime el dia de semana:");
        dia_semana = Integer.parseInt(sc.nextLine());

        if (dia_semana == 1) {
            System.out.println("El dia 1 de la semana es: Lunes");
        } else if (dia_semana == 2) {
            System.out.println("El dia 2 de la semana es: Martes");
        } else if (dia_semana == 3) {
            System.out.println("El dia 3 de la semana es: Mercules");
        } else if (dia_semana == 4) {
            System.out.println("El dia 4 de la semana es: jueves");
        } else if (dia_semana == 2) {
            System.out.println("El dia 5 de la semana es: Viernes");
        } else if (dia_semana == 2) {
            System.out.println("El dia 6 de la semana es: Sabado");
        } else if (dia_semana == 2) {
            System.out.println("El dia 7 de la semana es: Domingo");
        }



        //otra manera
        System.out.println("<------------------------------------------->");

        
        String mensaje = switch (dia_semana) {
            case 1 -> "El dia 1 de la semana es: lunes";
            case 2 -> "El dia 2 de la semana es: Martes";
            case 3 -> "El dia 3 de la semana es: Mercoles";
            case 4 -> "El dia 4 de la semana es: Jueves";
            case 5 -> "El dia 5 de la semana es: Viernes";
            case 6 -> "El dia 6 de la semana es: Sabado";
            case 7 -> "El dia 7 de la semana es: Domingo";
            default -> "Nada";
        };
        System.out.println(mensaje);




        sc.close();
    }
}
