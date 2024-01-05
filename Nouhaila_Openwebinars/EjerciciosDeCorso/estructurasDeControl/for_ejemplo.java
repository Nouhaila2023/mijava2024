package Nouhaila_Openwebinars.EjerciciosDeCorso.estructurasDeControl;



public class for_ejemplo {
    public static void main(String[] args) {
        // 5 primeros numeros, empezando es el 1

        for (int i = 1; i <= 5; i++) { // 1 2 3 4 5
            System.out.println(i );
        }

        System.out.println("<---------------->");

        for (int i = 10; i >= 0; i--) {
            System.out.println(i );
        }

        System.out.println("<--------------->");

        for (int i = 0; i <= 100; i+=2) { // +2 cada vez
            System.out.println(i );
        }

        System.out.println("<---------------->");

        int numero = 0;

        for (int i = 1; i <= 5; i++) { //suma
            numero += i;
        }
        System.out.println(numero );

        System.out.println("<----------------->");


        for (int i = 1; i >0; i++) { //Bucle infinito
            System.out.println(i);
        }


        
    }
}
