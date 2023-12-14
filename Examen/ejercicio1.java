package Examen;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/*
II: Craps. Es un juego de dados muy facil, y consiste en arrojar la suma de 2 dados,
y su suma es 7 u 11 ganas la partida. En cambio, si sacas un 2, 3 o 12 pierdes. Con cualquier
otro numero que saques, debes guardar ese número y tirar los dados repetidamente hasta
volver a sacar ese dado (ganas) o sacar el 7 (pierdes). Realiza el juego para dos jugadores
simulando las tiradas de forma aleatoria y que jueguen 10 partidas, indica cuántas partidas
gana jugador1 y cuántas jugador2. Ahora simula 1000 partidas e indica las partidas que
gana cada uno.
 */

public class ejercicio1 {
    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }
    public static void main(String[] args) {
        //crear una matriz 20×20 de números enteros que inicialmente rellenamos de valores aleatorios (1-100), 
        int[][] matriz = new int[20][20];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numaleatorio(1, 100);
            }
        }

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        //Aquí usaremos el bucle.Cual es (do Y while) , Esta opción es muy adecuada para crear una lista con muchas cosas buenas.
        do {
            System.out.println("Menú:");
            System.out.println("1. Intercambiar fila.");
            System.out.println("2. Suma de una columna.");
            System.out.println("3. Sumar diagonal principal e inversa.");
            System.out.println("4. Pintar coordenadas del mayor elemento.");
            System.out.println("5. Pintar matriz traspuesta.");
            System.out.println("6. Mostrar matriz ordenada.");
            System.out.println("7. Salir.");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    // caso 1 Intercambiar fila
                    System.out.print("Introduce el número de la fila1: ");
                    int fila1 = sc.nextInt();
                    System.out.print("Introduce el número de la fila2: ");
                    int fila2 = sc.nextInt();
                    int[] temp = matriz[fila1];
                    matriz[fila1] = matriz[fila2];
                    matriz[fila2] = temp;
                    break;
                case 2:
                    //caso 2 Suma de una columna
                    System.out.print("Introduce el número de la columna: ");
                    int columna = sc.nextInt();
                    int suma = 0;
                    for (int i = 0; i < matriz.length; i++) {
                        suma += matriz[i][columna];
                    }
                    System.out.println("La suma de la columna " + columna + " es " + suma);
                    break;
                case 3:
                    // caso 3 Sumar diagonal principal e inversa
                    int sumaDiagonalPrincipal = 0;
                    int sumaDiagonalInversa = 0;
                    for (int i = 0; i < matriz.length; i++) {
                        sumaDiagonalPrincipal += matriz[i][i];
                        sumaDiagonalInversa += matriz[i][matriz.length - i - 1];
                    }
                    System.out.println("La suma de la diagonal principal es " + sumaDiagonalPrincipal);
                    System.out.println("La suma de la diagonal inversa es " + sumaDiagonalInversa);
                    break;
                case 4:
                    // caso 4Pintar coordenadas del mayor elemento
                    int max = matriz[0][0];
                    int maxI = 0;
                    int maxJ = 0;
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            if (matriz[i][j] > max) {
                                max = matriz[i][j];
                                maxI = i;
                                maxJ = j;
                            }
                        }
                    }
                    System.out.println("El mayor elemento es " + max + " y se encuentra en la posición [" + maxI + "][" + maxJ + "]");
                    break;
                case 5:
                    // caso 5 Pintar matriz traspuesta
                    int[][] matrizTraspuesta = new int[matriz[0].length][matriz.length];
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            matrizTraspuesta[j][i] = matriz[i][j];
                        }
                    }
                    for (int i = 0; i < matrizTraspuesta.length; i++) {
                        for (int j = 0; j < matrizTraspuesta[i].length; j++) {
                            System.out.print(matrizTraspuesta[i][j] + " | ");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    // caso 6 Mostrar matriz ordenada
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            System.out.print(matriz[i][j] + " | ");
                        }
                        System.out.println();
                    }
                    break;
                case 7 :
                    // caso 7 final
                    System.out.println("Salir");
                    break;
                    default:
                break;
                    
                }
            }while (opcion != 7);
            System.out.println("elejer numero de 1 a 7: ");
        }
    }
