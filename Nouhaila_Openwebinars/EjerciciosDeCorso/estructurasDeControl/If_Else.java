package Nouhaila_Openwebinars.EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        float precio ;
        float iva ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Deme el precio: ");
        precio = Float.parseFloat(sc.nextLine());

        System.out.println("deme el iva: ");
        iva = Float.parseFloat(sc.nextLine());

        if (iva > 0 ) {
            precio += precio*iva;
        }

        System.out.println("El precio del producto es : " + precio);


        //Otro ejemplo:

        System.out.println("<---------------------------------------------->");

        int edad;
        final int edadMinema = 18;
        final int edadMxima = 67;

        System.out.println("Dime tu edad: ");
        edad = Integer.parseInt(sc.nextLine());

        if (edad >= edadMinema && edad <= edadMxima) {
            System.out.println("Puedes trabajar.");
        } else {
            System.out.println("No puedes trabajar.");
        }

        //Otro ejemplo.

        System.out.println("<----------------------------------------------------------------->");

        double nota;

        System.out.println("dime la nota: ");
        nota = Double.parseDouble(sc.nextLine());

        if (nota >= 5)
        System.out.println("estas aprobado."); 

        //Orto ejemplo.
        System.out.println("<-------------------------------------------->");

        int numero;

        System.out.println("Dime el numero nececario: ");
        numero = Integer.parseInt(sc.nextLine());

        if (numero < 0) {
            System.out.println("El numero es negativo: ");
        } else if (numero == 0){
            System.out.println("El numero es egual a cero: ");
        } else if (numero >= 1 && numero <10 ){
            System.out.println("El numero es positivo: ");
        }else{
            System.out.println("El numero mayor que 10: ");
        }
            
        
        sc.close();

    }
}
