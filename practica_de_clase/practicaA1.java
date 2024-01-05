import java.util.Arrays;

public class practicaA1 {
    /*
     * lonzamos 5 datos de pokes(. ; J ; Q ; K : ROJO ; NEGRO) Genera las teradas y detecta si ha salido poker (4 egoales) 
     */
    public static void main(String[] args) {
        int tiradas[] = new int[5];
        for (int i = 0; i < tiradas.length; i++) {           
            tiradas [i] = (int) (Math.random()*6)+1;
            
            if ((tiradas[0]==tiradas[1] && tiradas[0]==tiradas[2] && tiradas[0]==tiradas[3]) || (tiradas[1]==tiradas[2] && tiradas[1]==tiradas[3] && tiradas[1]==tiradas[4])){                
            }
            System.out.println("Poker");            
        }
        switch (tiradas[2]) {
            case 1:
                System.out.println(" . ");
                break;
            case 2:
                System.out.println(" J ");
                break;
            case 3:
                System.out.println(" Q ");
                break;
            case 4:
                System.out.println(" K ");
                break;
            case 5:
                System.out.println(" ROJO ");
                break;
            case 6:
                System.out.println(" NEGRO ");
                break;
            default:
                break;
        }
        System.out.println();
        Arrays.sort(tiradas);//ordinar
        System.out.println(tiradas);
        /*
         * Crear un raays con 20  palabras en español.
         * Crear otro raays con los mismas palabras en engles 
         * Haze un  fonción que se lepase una palabra en engles  y te devulva la traducción a español
         * 
         */
        
    }
}
