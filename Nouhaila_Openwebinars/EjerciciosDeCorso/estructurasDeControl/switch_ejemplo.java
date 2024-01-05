package Nouhaila_Openwebinars.EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

public class switch_ejemplo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.println("dime la nota: ");
        nota = Integer.parseInt(sc.nextLine());

        switch (nota) {
            case 10:
                break;
            case 9: System.out.println("Sobresaliente");
                break;
            case 8: 
                break;
            case 7: System.out.println("Notable");
                break;
            case 6: System.out.println("Bien");
                break;
            case 5: System.out.println("Suficiente");
                break;
            case 4, 3, 2, 1, 0: System.out.println("Insuficiente");
                break;
            default:
                System.out.println("Calificación invalida");
                break;

        }
        


            //Otra Manera:
            
        System.out.println("<------------------------------------------->");

        

        int notas;
        System.out.println("dime la nota:");
        notas = Integer.parseInt(sc.nextLine());

        String mensaje = switch (notas) {
            case 10 ,9 -> "Sobresaliente";
            case 8, 7 -> "Notable";
            case 6 -> "Bien";
            case 5 -> "Suficiente";
            case 4, 3, 2, 1, 0 -> "Insuficiente";
            default -> "Calificación invalida";
        };

        System.out.println(mensaje);
        sc.close();

    }
}
