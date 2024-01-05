package practica_total;
/*
 * Las constantes en Java son variables que mantienen un valor inmutable a lo largo de toda la vida del programa 1. 
 * Las constantes se definen mediante el modificador final y su valor se establece en el momento en que se declara y 
 * no puede cambiarse posteriormente 1. Las constantes son útiles para almacenar valores que se utilizan repetidamente en el 
 * código y que no deben ser modificados 2. 
 * La estructura para definir una constante en Java es la siguiente: 
 * static final nombreConstante = valor
 */

public class EjemplosConstantes {
    public static void main(String[] args) {
        final float PI = 3.145f;
        //PI = 3;
        final int unidad = 1;
        //unidad = 2;
        final String hola = "salam";
        // hola = "salam";

        System.out.println("PI = " + PI);
        System.out.println( "unidad = " + unidad);
        System.out.println( "hola = " + hola);







    }
}
