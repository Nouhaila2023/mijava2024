
import java.util.Scanner;
//6. Programa que sume los 100 primeros números enteros impares.
public class rj5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = 0;
        num = sc.nextInt();
        int contador = 1;
        while( (num / 10)>0){
            contador++;
            num = (num /10);
        }
        System.out.println("el numero " + num +" tiene " + contador + " digitos") ;


        //14. 
        Scanner no = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        num1 = no.nextInt();
        do{
            num2 = no.nextInt();

        }while (num1 < num2);
        for(int i =0; i >= num2 ; i++){
        contador++;
        }   System.out.println("null");



        //19
        Scanner nu = new Scanner(System.in);
        boolean ES_premo= true;
        int numero = nu.nextInt();
        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                System.out.println(ES_premo  + " =false");
                break;
            }
        }

        //
        Scanner scanner = new Scanner(System.in);

        int cuentas , decenas, unidades ,numeros;

        System.out.println( "numero");

        numeros = scanner.nextInt();
        cuentas = numeros / 100;
        decenas = numeros / 10;
        unidades = numeros % decenas;

        System.out.println( unidades + decenas + cuentas);

    












    }
}
