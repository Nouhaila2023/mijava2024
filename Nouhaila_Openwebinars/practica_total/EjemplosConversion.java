package practica_total;

public class EjemplosConversion {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Conversion sin perdida de informacion
        int i = 123;
        long l = i;
        System.out.println("Convercin de int --> long ");
        System.out.println("i " + i );
        System.out.println("l " + l);

        //con perdida

        long l2 = 123_345_635l;
        System.out.println("Conversion de long --> float");
        System.out.println("l2 =" + l2);
        float l1 = l2;
        System.out.printf( "%.1l",l1); 
        

    }
}
