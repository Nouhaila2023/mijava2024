package examen;

public class ejercicio2 {

    private static boolean tirada;


    public static int generarNumero(int min, int max) {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }


    public static void main(String[] args) {
        int terada = 0;
        int jugador1 =0;
        int jugador2 = 0;
        int ganaJugador1 = 0;
        int ganaJugador2 = 0;
        
        for (int i = 1; i <= 10; i++) {
            terada = generarNumero(1, 12);
            System.out.println("Partida " + i + ":");
            System.out.println(terada);
            switch (jugador1) {
                case 1:
                    if (terada == 7 || terada == 11) {
                        System.out.println("Es el ganador: " + terada );
                        ganaJugador1++;
                    }
                    break;
                case 2:
                    if ((terada == 3 || terada == 2 || terada == 12 )) {
                        System.out.println("No es el ganador: " + terada );
                    
                    }
                    break;
            
                default:
                    break;
            }
            switch (jugador2) {
                case 1:
                    if (terada == 7 || terada == 11) {
                        System.out.println("Es el ganador: " + terada );
                        ganaJugador2++;
                    }
                    break;
                case 2:
                    if ((terada == 3 || terada == 2 || terada == 12 )) {
                        System.out.println("No es el ganador: " + terada );
                    
                    }
                    break;
            
                default:
                    break;
            }

            while (tirada) {
                if (terada == 2 || terada == 3 || terada == 11) {
                    System.out.println("No es el ganador: " + terada);
                }else if (terada ==  7  || terada == 11){
                    System.out.println("Es el ganador: " + terada);
                    ganaJugador1++;
                }
                
            }
             
            if (terada == 7 || terada == 11){
                System.out.println ("es el ganador: " + terada);
            }
            
            else if (terada == 2 || terada == 3 || terada == 11){
                System.out.println("No es el ganador: " + terada);
            }

            if (terada == 7 || terada == 11) {
                System.out.println("Es el ganador: " + terada );
                ganaJugador1++;
            }

            if ((terada == 3 || terada == 2 || terada == 12 )) {
                System.out.println("No es el ganador: " + terada );
                    
            }

            if (terada == 1 ||terada == 4 || terada == 5 || terada == 6 || terada == 8 || terada == 9 || terada == 10) {
                System.out.println("Retorn: " + terada);
            }




        } 
    }
}

