package Examen;
/*
 Vamos a implementar funciones para usar Morse. En primer lugar, te pongo la
equivalencia de las letras a caracteres Morse.
Tienes que implementar una función convertirAMorse que reciba como
parámetro una cadena de texto en español y devolver un String con la
misma cadena, pero traducida a Morse. Los espacios entre palabras ponlos
con el carácter “#”. Cada letra Morse la separaremos por un espacio.
Pruébala. Ej: “hola mundo”  “…. --- .-.. .-#-- ..- -. -.. ---“
Ahora vas a realizar una función que haga lo contrario convertirDeMorse
que reciba una cadena con un texto en Morse, las palabras separadas por el
carácter “#” y debes pintar el texto original en español. Además, para leer
bien cada letra Morse, irá separada por un espacio.
Recuerda que puedes usar indexOf pasándole un segundo parámetro que te
diga a partir de donde buscar. Intenta hacer el ejercicio al principio solo con
una palabra, y cuando lo tengas prueba a hacerlo con más de una palabra
Pista: para la equivalencia construye dos arrays de Strings, uno con las letras
y otro con las traducciones a Morse. Al estar en la misma posición, tienes la
traducción. Como un diccionario.
 */

import java.util.HashMap;

public class ejercicio {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String mensajeEspañol = "hola mundo";

        char[]palabra ={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String[] palabras = texto.split(" ");
       
            for (int i = 0; i < palabra.length(); i++) {
                char letra = palabra.charAt(i);
                    if (a) {
                        System.out.println(".-");
                    }else if (b) {
                        System.out.println("-...");
                    }else if (c) {
                        System.out.println("-.-.");
                    }else if (d) {
                        System.out.println("-..");
                    }else if (e) {
                        System.out.println(".");
                    }else if (f) {
                        System.out.println("..-.");
                    }else if (g) {
                        System.out.println("--.");
                    }else if (h) {
                        System.out.println("....");
                    }else if (i) {
                        System.out.println("..");
                    }else if (j) {
                        System.out.println(".---");
                    }else if (k) {
                        System.out.println("-.-");
                    }else if (l) {
                        System.out.println(".-..");
                    }else if (m) {
                        System.out.println("--");
                    }else if (n) {
                        System.out.println("-.");
                    }else if (o) {
                        System.out.println("---");
                    }else if (p) {
                        System.out.println(".--.");
                    }else if (q) {
                        System.out.println("--.-");
                    }else if (r) {
                        System.out.println(".-.");
                    }else if (s) {
                        System.out.println("...");
                    }else if (t) {
                        System.out.println("-");
                    }else if (u) {
                        System.out.println("..-");
                    }else if (v) {
                        System.out.println("...-");
                    }else if (w) {
                        System.out.println(".--");
                    }else if (x) {
                        System.out.println("-..-");
                    }else if (y) {
                        System.out.println("-.--");
                    }else if (z) {
                        System.out.println("--..");
                    }else if ( letra == " "){
                        System.out.println(" # ");
                    }else {
                    int indice = obtenerIndice(letra);
                    if (indice != -1) {
                        morse.append(CARACTERES_MORSE[indice]).append(" ");
                    }
                } 
                
            
        }    
    }
}
   


