package EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;


/*Escribe un programa que genere un número aleatorio entre 1 y 100. 
Luego, pídele al usuario que adivine el número. 
El programa deberá indicar si el número ingresado es mayor o menor que 
el número generado hasta que el usuario adivine correctamente */

public class while3 {

    public static int generarNumero(int min, int max) throws Exception {
        //Si min > max, lanzamos Exception "min debe ser menor que max"
        if (min > max) {
            throw new Exception("El valor mínimo no puede ser mayor que el máximo");
        }

        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }

    public static void main(String[] args) throws Exception {

        int numero;
        
        boolean correctos = false;

        int numero_generelo = generarNumero(1, 100);

        Scanner sc = new Scanner(System.in);


        while (!correctos) {

        System.out.println("Dime el numero:");
        numero = Integer.parseInt(sc.nextLine());

            if (numero < numero_generelo ) {
                System.out.println("El numeor es mayor");
            } else if (numero > numero_generelo){
                System.out.println("Le numero es menor");
            } else {
                System.out.println("Esta correcto");
                correctos = true;
            }
        }

        sc.close();
        
    }
    
}
