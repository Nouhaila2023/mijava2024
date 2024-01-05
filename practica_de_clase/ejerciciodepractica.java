import java.util.Scanner;

public class ejerciciodepractica {
    
        public static int juego(){ 
            int dice;
            int min=1, max=6;
            return dice = ((int) (Math.random()*(min -max +1)+min));
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        int tirada1 ,tirada2_1, tirada2_2, tirada2_3, tirada2_4, totalj1,totalj2,totalempate=0,turno,cubitus, humerus;
        Scanner sc =new Scanner(System.in);
            try {
                    System.out.println("Dime los turnos que váis a jugar: ");
                    turno = sc.nextInt();
                    for(int i =1; i <= turno ;i++){
                        System.out.println(+1);
                        tirada1 = juego();
                        tirada2_1 = juego();
                        tirada2_2 = juego();
                        tirada2_3 = juego();
                        tirada2_4 = juego();

                        System.out.println("Cubitus (j1): " + tirada1 + " Humerus (j2): " + tirada2_1 + ", " + tirada2_2 + ", " + tirada2_3 + ", " + tirada2_4);

                        if((tirada1 == tirada2_1) && (tirada1 == tirada2_2) && (tirada1 == tirada2_3) && (tirada1 == tirada2_4)){
                            System.out.println("el gana el premer jugador" );
                            totalj1 ++;
                            
                        }else {
                            System.out.println("el sugondo jugador que gana" );
                            totalj2++;
                        }
                    }
                
                    
                    catch (Exception ex) {
                        System.out.println("No has introducido un número para los turnos a jugar");
                    }

                    System.out.println("El J1 ha sacado " + totalj1 + " puntos");
                    System.out.println("El J2 ha sacado " + totalj2 + " puntos");
                }           
    }
}  





    

//cubitus y     juegan alos datos 
        //1 pedi por teclado el numero e turno a jugar 
        //cubitas va teran 4 datos de 1 a 6 , si el valor de l aterada de un nuestar en nungono de los datos cobetos gana un punto humeus. sino gana un pu8nto cubeto
        //Muestra todos la tiradas , la puntuacion en cada turno y el restultodo fivol