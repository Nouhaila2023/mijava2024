package EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

/*
 * Ejercicio VII
Escribe un programa en Java que acepte por teclado dos números enteros y 
calcule su máximo común divisor usando el algoritmo de Euclides.
Dicho algoritmo tiene los siguientes pasos:
a) Se divide el número mayor (`a`) entre el menor (`b`).
b) Si la división es exacta (resto igual a 0), el divisor es el m.c.d.
c) Si la división no es exacta, dividimos el divisor entre el resto obtenido y continuamos 
de esta forma hasta obtener una división exacta. El m.c.d. es el último divisor.
 */
public class ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int resultado;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Dime el premer numero:");
        a = Integer.parseInt(sc.nextLine());

        System.out.println("Dime el segundo numero:");
        b = Integer.parseInt(sc.nextLine());

        if (a >= mayor) {
            mayor = a;
          } else if (a <= menor) {
            menor = a;
          } else if (b >= mayor) {
            mayor = b;
          } else if (b <= menor) {
            menor = b;
          }

        System.out.println(mayor);
        System.out.println(menor);

        while (b != 0) {
            resultado = a % b;
            a = b;
            b = resultado;
        }

        System.out.println(a);








        sc.close();



    }
}
