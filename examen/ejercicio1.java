package Examen;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.SpringLayout;

/*
 * 1. [2 puntos] Nos piden crear una matriz 20×20 de números enteros que inicialmente
rellenamos de valores aleatorios (1-100), nos piden hacer un menú con estas opciones:
1. Intercambiar fila. Te pedirá dos números de fila e intercambiará los valores de la
   primera por los valores de la segunda.
2. Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
3. Sumar la diagonal principal y la diagonal inversa, y mostrar las dos sumas
4. Pintar las coordenadas i,j donde se encuentra el mayor elemento de la matriz.
5. Pinta la matriz traspuesta
6. Muestra la matriz con las filas ordenadas de mayor a menor
7. Salir 

 */
public class ejercicio1 {
    //numero aleattorio de 1 a 100
    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }
    public static void main(String[] args) {
        //Nos piden crear una matriz 20×20 de números

        int numero [][] = new int[20][20]; 

        //llamar el numero aleatorio
        for (int i = 0; i < numero.length; i++) {
            
            for (int j = 0; j < numero.length; j++) {
                numero [i][j] = numaleatorio(1, 100);
            }  
        }

        System.out.println(Arrays.toString(numero));
        

        










    }
}
