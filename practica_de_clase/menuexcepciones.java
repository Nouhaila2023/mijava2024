import java.util.Scanner;

public class menuexcepciones {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        while(opcion != 3){
            System.out.println("1. Saludo anónimo");
            System.out.println("2. Saluda Nouhaila");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            try{
                System.out.println("dime un nomero");
                opcion = Integer.parseInt(sc.nextLine());
                switch(opcion){
                    case 1:
                        System.out.println("hola mondo");
                        break;
                    case 2:
                        System.out.println("hola");
                        break;
                    default:
                         System.out.println("buenas noches");              
                        break;
                }
            }
            catch (NumberFormatException ex){
                System.out.println(" te has equivocada al escribir la opcion, por favor escribe (1, 2, 3)");
            }
        }
    } 
}       