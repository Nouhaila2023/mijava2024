import java.lang.reflect.Array;
import java.util.Arrays;

public class practicaA {
    /*
     * Crear un arrey de 20 int y rellenalo cno el numero 1 .
     * Pintalo, Ahora consigue que los elementos en  posicion pares tengan valor -1.
     */
    public static void main(String[] args) {
        int numero[] =  new int[20];  
        Arrays.fill(numero, 1);              
        System.out.println(numero);
        for (int i = 0; i < numero.length; i++) {
            if (i % 2 == 0) {
                numero[i] = -1;
            }
        }
        System.out.println(Arrays.toString(numero));
        

    }
}
