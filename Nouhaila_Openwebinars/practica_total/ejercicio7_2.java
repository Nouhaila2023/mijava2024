package practica_total;

import java.util.Scanner;

/*
Ejercicio VII
Escribe un programa en Java que acepte por teclado dos números enteros y calcule su máximo común divisor usando el algoritmo de Euclides. Dicho algoritmo tiene los siguientes pasos:
a) Se divide el número mayor (a) entre el menor (b).
b) Si la división es exacta (resto igual a 0), el divisor es el m.c.d.
c) Si la división no es exacta, dividimos el divisor entre el resto obtenido y continuamos de esta forma hasta obtener una división exacta. El m.c.d. es el último divisor.
*/

public class ejercicio7_2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = 10;
    int b = 20;
    int resultado;
    

    System.out.println("Dime el primer numero:");
    a = Integer.parseInt(sc.nextLine());
    System.out.println("Dime el segundo numero:");
    b = Integer.parseInt(sc.nextLine());

    int mayor = Integer.MAX_VALUE;
    int menor = Integer.MIN_VALUE;

    // Comparamos los valores de las variables
        if (a > mayor) {
            mayor = a;
        }
        
        if (b > mayor) {
            mayor = b;
        }
        
        if (a < menor) {
            menor = a;
        }
        
        if (b < menor) {
            menor = b;
        }

    
    while (b != 0) {
      resultado = a % b;
      a = b;
      b = resultado;
    }
    System.out.println(a);
    System.out.println(mayor);
    System.out.println(menor);

    sc.close();
  }
}
