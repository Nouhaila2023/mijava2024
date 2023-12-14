package Examen;

import java.util.Random;
/*
 * 
I: Nos piden crear una matriz 20×20 de números enteros que inicialmente
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

public class ejercicio2 {
     public static void main(String[] args) {
        Partidas(10);
        Partidas(1000);
    }

    public static void Partidas(int partida) {
        int jugador1Ganadas = 0;
        int jugador2Ganadas = 0;

        for (int i = 0; i < partida; i++) {
            boolean ganoJugador1 = jugar();
            boolean ganoJugador2 = jugar();

            if (ganoJugador1) {
                jugador1Ganadas++;
            }

            if (ganoJugador2) {
                jugador2Ganadas++;
            }
        }

        System.out.println("Resultados de " + partida + " partidas:");
        System.out.println("Jugador 1 gane " + jugador1Ganadas + " partidas");
        System.out.println("Jugador 2 gane " + jugador2Ganadas + " partidas");
        System.out.println();
    }

    public static boolean jugar() {
        Random random = new Random();
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int suma = dado1 + dado2;

        if (suma == 7 || suma == 11) {
            // Ganar
            return true;
        } else if (suma == 2 || suma == 3 || suma == 12) {
            // Perder
            return false;
        } else {
            // Guardar el punto y seguir tirando
            int punto = suma;
            do {
                dado1 = random.nextInt(6) + 1;
                dado2 = random.nextInt(6) + 1;
                suma = dado1 + dado2;
            } while (suma != punto && suma != 7);

            // Ganar si se obtiene el punto antes de sacar un 7
            return suma == punto;
        }
    }
}
