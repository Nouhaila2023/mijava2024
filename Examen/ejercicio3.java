package Examen;
public class ejercicio3 {
    public static void main(String[] args) {
        // Prueba convertirAMorse
        String fraseEspañol = "hola mundo";
        String CaraMorse = convertirAMorse(fraseEspañol);
        System.out.println("Mensaje en Morse: " + CaraMorse);

        // Prueba convertirDeMorse
        String mensajeDeMorse = ".... --- .-.. .-#-- ..- -. -.. ---";
        String mensajeOriginal = convertir(mensajeDeMorse);
        System.out.println("Mensaje original: " + mensajeOriginal);
    }

    static String convertirAMorse(String textoEspañol) {
        textoEspañol = textoEspañol.toLowerCase();
        StringBuilder morse = new StringBuilder();

        for (int i = 0; i < textoEspañol.length(); i++) {
            char letra = textoEspañol.charAt(i);

            if (letra == ' ') {
                morse.append("# ");
            } else {
                int indice = obtenerIndice(letra);
                if (indice != -1) {
                    morse.append(MORSE[indice]).append(" ");
                }
            }
        }

        return morse.toString().trim();
    }

    static String convertir(String textoMorse) {
        StringBuilder español = new StringBuilder();
        String[] palabras = textoMorse.split("#");

        for (String palabraMorse : palabras) {
            String[] letrasMorse = palabraMorse.trim().split(" ");

            for (String letraMorse : letrasMorse) {
                int indice = Morse(letraMorse);
                if (indice != -1) {
                    español.append(letras[indice]);
                }
            }

            español.append(" ");
        }

        return español.toString().trim();
    }

    static int obtenerIndice(char letra) {
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == letra) {
                return i;
            }
        }
        return -1; 
    }

    static int Morse(String morse) {
        for (int i = 0; i < MORSE.length; i++) {
            if (MORSE[i].equals(morse)) {
                return i;
            }
        }
        return -1; 
    }

    
    static final char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static final String[] MORSE = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
}
