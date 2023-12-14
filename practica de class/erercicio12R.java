public class erercicio12R {
    public static int generalN(){
        int  generalN = (int) (Math.random()*6+1);
    }

    public static void main(String[] args) {
        int tirada1=0;
        int tirada2=0;
        int terada3=0;
        int contador=0;
        do {
            tirada1 = generalN(1,6);
            tirada2 = generalN(1,6);
            tirada3 = generalN(1,6);
            
        } while (!(tirada1 == tirada2 && tirada2 == terada3 && tirada1 == terada3)){
            System.out.println("tirada" + tirada1 + "  " + tirada2 + "  " + terada3) ;
            System.out.println("Intiendos" + contador);
            
        }
    }
}