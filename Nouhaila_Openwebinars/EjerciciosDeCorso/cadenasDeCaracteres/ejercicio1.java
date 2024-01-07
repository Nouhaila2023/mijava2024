package Nouhaila_Openwebinars.EjerciciosDeCorso.cadenasDeCaracteres;

import java.util.Scanner;

public class ejercicio1 {
    private static final String Limpia1 = null;

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String entrada;
        String minus;

        //leemos por teclado la palabras o frase
        System.out.println("Introduzca la palabra o frase");
        entrada = sc.nextLine();

        //Pasamos a minusculas
        minus = entrada.toLowerCase();  //kathawal lhoros lsgar

        //limpicios la cadena

        //Espacios en blanco
        String limpia1 = minus.trim();
        System.out.println(limpia1);
        
        String limpia = "";

        //Despues, de espacios a mitad de la cadena
        // o de vocales acentuadas
        for (int i = 0; i < Limpia1.length(); i++) {
            String sub = Limpia1.substring(i, i+1);
            if (!sub.isBlank()) {
                sub = switch(sub){
                    case "á" -> "á";
                    case "é" -> "é";
                    case "í" -> "í";
                    case "ú" -> "ú";
                    case "ó" -> "ó";
                    default -> sub;
                };      
                limpia += sub;         
            }
        }

        //Obtenemos la cadena inversa
        String inversa ="";
        for (int i = limpia.length()-1; i >= 0; i--) {
            inversa += limpia.charAt(i);
        }

        //Comprobamos si son iguales
        if (limpia.equals(inversa)) {
            System.out.println("En un palidromo");
        } else {
            System.out.println("On es un palindromo");
        }

        sc.close();

    }
}
