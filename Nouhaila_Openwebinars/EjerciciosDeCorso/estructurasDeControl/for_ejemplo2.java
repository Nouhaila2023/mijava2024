package EjerciciosDeCorso.estructurasDeControl;
import java.util.Scanner;

public class for_ejemplo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros;

        System.out.println("Dime el numero: ");
        numeros = Integer.parseInt(sc.nextLine());

        boolean esPrimo = true;

        if (numeros < 2) {
            esPrimo = false;
        }
        for (int i = 2; i < numeros; i++) {
            if (numeros % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println(numeros + " es peimo");
        } else {
            System.out.println(numeros + " no es peimo");
        }

        sc.close();
        
    }
}
