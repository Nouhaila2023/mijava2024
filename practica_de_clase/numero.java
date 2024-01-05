import java.util.Scanner;

public class numero {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        int cuentas , decenas, unidades ,numeros ,resulta;

        System.out.println( "numero");

        numeros = scanner.nextInt();
        cuentas = numeros / 100;
        decenas = numeros / 10 % 10;
        unidades = numeros % 10;

        System.out.println(cuentas );

        System.out.println(decenas  );

        System.out.println( unidades );
        resulta = ( (100 * cuentas )+ (10 * decenas) + unidades);
        System.out.println("numero = " + resulta); 


    }
}
