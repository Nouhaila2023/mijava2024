import java.util.Scanner;
import java.util.Scanner;
public class ejercNouhaila {



    public static void main(String[] args) {
        String cadena = "Mi amiga Ana es prima de Eva y de Irene";
        Scanner caracTerE = new Scanner(System.in);
        System.out.println("Dami uno caracter 'e' : ");
        char caracterE = caracTerE.next().charAt(0);
        
    }

    public static String prametroUnaCadena(String cadena, char caracterE) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'a' ) {
                resultado.append(caracterE);
            }else if (caracter == 'e') {
                resultado.append(caracterE);
            }else if (caracter == 'i') {
                resultado.append(caracterE);
            }else if (caracter == 'o') {
                resultado.append(caracterE);
            }else if (caracter == 'u') {
                resultado.append(caracterE);
            }else if (caracter == 'A') {
                resultado.append(caracterE);
            }else if (caracter == 'E') {
                resultado.append(caracterE);
            }else if (caracter == 'I') {
                resultado.append(caracterE);
            }else if (caracter == 'O') {
                resultado.append(caracterE);
            }else if (caracter == 'U') {
                resultado.append(caracterE);
            }else {
                resultado.append(caracter);
            }
        }
        return resultado.toString();
    }    
}

