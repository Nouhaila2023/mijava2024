import java.util.Scanner;

public class eje9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        while (opcion != 4){
                System.out.println("Selecciona una opción:");
                System.out.println("1 = Opción A");
                System.out.println("2 = Opción B");
                System.out.println("3 = Opción C");
                System.out.println("4 = Opción d");
                opcion = scanner.nextInt();

                switch( opcion){
                case 1 : System.out.println("Aniader");break;
                case 2 : System.out.println("Eliminado");break;
                case 3 : System.out.println("limpiado podo");break;
                case 4 : System.out.println("adios");break;
               

                }
        }    
        }    
    }

    

