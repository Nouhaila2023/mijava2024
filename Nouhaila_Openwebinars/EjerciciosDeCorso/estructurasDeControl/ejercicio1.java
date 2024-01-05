package EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

/*
● Implementa un programa en Java que dada una fecha, nos indique cuál es la estación del año 
○ En el hemisferio que tú quieras, aunque la solución se dará del 
hemisferio norte.
● El día del mes, y el mes del año se deben introducir como números enteros a través del teclado

Primavera: del 21 de marzo al 20 de junio.
Verano: del 21 de junio al 22 de septiembre.
Otoño: del 23 de septiembre al 21 de diciembre.
Invierno: del 22 de diciembre al 20 de marzo
 */
public class ejercicio1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int dia;
        int mes;

        System.out.println("El dia:");
        dia = Integer.parseInt(sc.nextLine());

        System.out.println("El mes:");
        mes = Integer.parseInt(sc.nextLine());


  
        if (mes == 4 || mes == 5 || (mes == 3 && dia <= 21) || (mes == 6 && dia >= 20) ) {
            System.out.println("Primavera");
        }else if ((mes == 6 && dia >= 21 ) || mes == 7 || mes == 8 || (mes == 9 && dia <= 22)){
            System.out.println("Verano");
        }else if ((mes == 9 && dia >= 23 ) || mes == 10 || mes == 11 || (mes == 12 && dia <= 21)){
            System.out.println("Otoño");
        }else if ((mes == 12 && dia >= 22 ) || mes == 1 || mes == 2 || (mes == 3 && dia <= 20)){
            System.out.println("Invierno");
        }


        //Otra maner.
        System.out.println("<------------------------------------------------------>");


        switch (mes) {
            case 1, 2 :
                System.out.println("Invierno");
                break;
            case 3:
                if ( dia < 21){
                    System.out.println("Invierno");
                }else if( dia >21){
                    System.out.println("Primavera");
                }                
            break;            
            case 4,5:
                System.out.println("Primavera");
            break;
            case 6:
                if (dia <= 20) {
                    System.out.println("Primavera");
                } else if ( dia >= 21){
                    System.out.println("verano");
                }
            break;
            case 7,8:
                System.out.println("verano");
            break;
            case 9:
                if (dia <= 22) {
                    System.out.println("Verano");
                } else if(dia >= 23) {
                    System.out.println("Otoño");
                }
            break;
            case 10,11:
                System.out.println("Otoño");
            break; 
            case 12:
                if (dia <= 21) {
                    System.out.println("Otoño");
                } else if(dia >= 22) {
                    System.out.println("invierno");
                }
            break;           
            

            default:
                break;
        }
        sc.close();
    }
}
