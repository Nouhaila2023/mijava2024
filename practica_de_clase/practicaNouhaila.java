import java.util.Scanner;
/*
 * Ejercicio 5
Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es bisiesto si e
s un número divisible por 4
, pero no si es divisible por 100, excepto que también sea divisible por 400.
 */

public class practicaNouhaila {
    public static void main(String[] args) {
        int año;
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el año: ");
        año = sc.nextInt();
        if(año %4 == 0 && año % 100 == 0 || año % 400 ==0){
            System.out.println("es un año bivisible: " );
        }else{
            System.out.println("no es un año bivisible: " );
        } 
        
    }
}
/*
 * (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
 */
