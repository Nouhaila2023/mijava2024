package Nouhaila_Openwebinars.EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);

        System.out.println("dime la nota:");
        nota = Integer.parseInt(sc.nextLine());

        /*switch (nota) {
            case 10,9:
                System.out.println("Sobresaliente");
                break;
            case 8,7:
                System.out.println("Notable");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 4,3,2,1,0:
                System.out.println("Suspenso");
                break;
            default:
                System.out.println("Error nota ");
                break;
        }*/


        String nota_final = switch (nota){
            case 10,9 -> "Sobresaliente";
            case 8,7 -> "Notable";
            case 6 -> "bien";
            case 5 -> "Suficiente";
            case 4,3,2,1,0 -> "Suspenso";
            default -> "Error";
        };
        System.out.println("La nota " + nota + " final es: " + nota_final );










        sc.close();
    }
}
