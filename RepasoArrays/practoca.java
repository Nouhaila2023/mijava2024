package RepasoArrays;


import java.util.Random;

public class practoca {
    public static void main(String[] args) {
        Random rand = new Random();
        int jugador1, jugador2, suma;
        int ganadasJugador1 = 0, ganadasJugador2 = 0;

        // Simulamos 10 partidas
        for (int i = 1; i <= 10; i++) {
            System.out.println("Partida " + i + ":");

            // Simulamos 1000 partidas dentro de cada partida
            for (int j = 1; j <= 1000; j++) {
                jugador1 = rand.nextInt(6) + 1;
                jugador2 = rand.nextInt(6) + 1;
                suma = jugador1 + jugador2;

                if (suma == 7 || suma == 11) {
                    ganadasJugador1++;
                } else if (suma == 2 || suma == 3 || suma == 12) {
                    ganadasJugador2++;
                } else {
                    int punto = suma;
                    while (true) {
                        jugador1 = rand.nextInt(6) + 1;
                        jugador2 = rand.nextInt(6) + 1;
                        suma = jugador1 + jugador2;

                        if (suma == punto) {
                            ganadasJugador1++;
                            break;
                        } else if (suma == 7) {
                            ganadasJugador2++;
                            break;
                        }
                    }
                }
            }

            System.out.println("Jugador 1: " + ganadasJugador1 + " ganadas");
            System.out.println("Jugador 2: " + ganadasJugador2 + " ganadas");
            System.out.println();
        }

        // Simulamos 1000 partidas
        ganadasJugador1 = 0;
        ganadasJugador2 = 0;
        for (int i = 1; i <= 1000; i++) {
            jugador1 = rand.nextInt(6) + 1;
            jugador2 = rand.nextInt(6) + 1;
            suma = jugador1 + jugador2;

            if (suma == 7 || suma == 11) {
                ganadasJugador1++;
            } else if (suma == 2 || suma == 3 || suma == 12) {
                ganadasJugador2++;
            } else {
                int punto = suma;
                while (true) {
                    jugador1 = rand.nextInt(6) + 1;
                    jugador2 = rand.nextInt(6) + 1;
                    suma = jugador1 + jugador2;

                    if (suma == punto) {
                        ganadasJugador1++;
                        break;
                    } else if (suma == 7) {
                        ganadasJugador2++;
                        break;
                    }
                }
            }
        }
        
        System.out.println("En 1000 partidas:");
        System.out.println("Jugador 1: " + ganadasJugador1 + " ganadas");
        System.out.println("Jugador 2: " + ganadasJugador2 + " ganadas");
    }
}


