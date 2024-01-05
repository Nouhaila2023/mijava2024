import java.util.Scanner;

public class eje2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0 , contador = 0 , numero = -1 , media;
        
        System.out.println("numero");
        while (numero != 0){
            numero = sc.nextInt();
            if(numero!=0){
            suma = suma + numero;
            contador++;
            }
        }
        media = ( suma / contador);
        System.out.println("la suma es =" + suma);
        System.out.println("la media es =" + contador);
        
        
   

//pide un numero por teclado. muestra sus divisores, muastra cuantos son
Scanner scanner = new Scanner(System.in);
        System.out.print("que es el número: ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("El número " + number + " tiene " + count + " divisores.");
//pide una base y un expronte y muestra la potencia, sin usar Math.powl()
        Scanner sa = new Scanner(System.in);
        System.out.print("pide el exponente =  ");
        System.out.print("pide el muestra =  ");

        int a = sa.nextInt();
       


       






    }
}



