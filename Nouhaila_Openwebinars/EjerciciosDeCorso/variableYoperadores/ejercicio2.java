package EjerciciosDeCorso.variableYoperadores;

import java.util.Scanner;

/**
* Realiza un programa en Java que calcule la nota media de un alumno en la asignatura de Programación. 
* La nota media se calcula como el promedio de las 3 notas trimestrales. Muestra la nota promedio redondeada 
* y además, muestra un mensaje 
* que indique si el alumno está APROBADO (nota final >= 5) o suspenso (nota final < 5). 
*/
public class ejercicio2 {
    public static void main(String[] args) {
        double nota1=0;
        double nota2=0;
        double nota3=0;
        double media ;
        Scanner sc = new Scanner(System.in);
        System.out.println("dame el premer numero: ");
        nota1 = Double.parseDouble(sc.nextLine());

        System.out.println("dame el segundo numero: ");
        nota2 = Double.parseDouble(sc.nextLine());

        System.out.println("dame el tercero numero: ");
        nota3 = Double.parseDouble(sc.nextLine());

        media = (nota1 + nota2 + nota3)/3;
        System.out.println("la media de tres numero es: " + " ( " + nota1 + " + " +  nota2  + " + " + nota3 + " )" + " / " + " 3 " + " = " + media);

        String prpvado = (media >= 5) ?  "APROBADO" : "SUSPENSO";
        System.out.println("Aprpvado: " + prpvado);
        sc.close();
   }   
   
}
