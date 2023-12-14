import java.util.Arrays;

public class ejercicio2P3 {
    public static void main(String[] args) {
        /*
         * Crea una función que reciba como parámetro un array de 10 enteros, debe devolver el mismo array donde se
            hayan intercambiado el primer elemento y el último elemento
         */
        int numero[] = {1,55,3,77,98,34};
        int temp = numero[0];
        numero[0] = numero[numero.length-1];
        numero[numero.length-1]=temp;
        System.out.println(Arrays.toString(numero));

    }
}
