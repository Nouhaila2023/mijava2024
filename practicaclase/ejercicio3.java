package practicaclase;

public class ejercicio3 {
    public static void main(String[] args) {
        char datos[][] = new char[8][8];
/*Para inicializarlo lo rellenaremos inicialmente con B para las casillas negras
 y W para las blancas Realiza esa parte de pintar el tablero con una función y pruébala.*/
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i +j) % 2 == 0){
                    System.out.println("B");
                } else {
                    System.out.println("N");
                }
            }
        }
    }
}


