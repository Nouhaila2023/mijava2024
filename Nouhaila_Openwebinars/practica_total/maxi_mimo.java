package Nouhaila_Openwebinars.practica_total;
import java.util.Scanner;
public class maxi_mimo {
    public static void main(String[] args) {
        

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el primer número:");
    int a = sc.nextInt();

    System.out.println("Introduce el segundo número:");
    int b = sc.nextInt();

    // Inicializamos las variables
    int mayor = Integer.MIN_VALUE;
    int menor = Integer.MAX_VALUE;

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

    // Imprimimos los resultados
    System.out.println("El mayor es: " + mayor);
    System.out.println("El menor es: " + menor);

    sc.close();
  }
    
}
