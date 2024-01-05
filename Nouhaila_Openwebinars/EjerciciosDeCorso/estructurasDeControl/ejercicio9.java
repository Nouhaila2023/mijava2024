package EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

/*
 * 9. Escribe un programa en Java que compruebe si un carácter es una vocal o no.
 */
public class ejercicio9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String vocales = "";

        System.out.println("Texto");
        vocales = sc.nextLine();

        char caracter = ' ';

        caracter = vocales.charAt(0);

       /*if (caracter == 'a' || caracter == 'o' || caracter == 'u' || caracter == 'e' || caracter == 'i' || caracter == 'A' || caracter == 'O' || caracter == 'U' || caracter == 'E' || caracter == 'I' ) {
            System.out.println("Es vocal ");
        }else{
            System.out.println("No es vocal");
        }*/


        switch (caracter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Es un vocal");
                break;
            default :
                System.out.println("No es un vocal");
        }


        sc.close();
        
        

    }
}
