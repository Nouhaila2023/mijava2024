import java.util.Scanner;

public class ejercicio4P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nPercona;
        double sum = 0;
        double[] altu;

        System.out.print("Introduzca el número de personas: ");
        nPercona = sc.nextInt();
        altu = new double[nPercona];

        for (int i = 0; i < nPercona; i++) {
        System.out.print("Introduzca la altura de la persona " + (i + 1) + " (en metros): ");
        altu[i] = sc.nextDouble();
        sum += altu[i];
        }

        double average = sum / nPercona;
        System.out.println("La altura media de las " + nPercona + " personas es de " + average + " m ");

        int altu_superior=0;
        int altu_medio=0;
        for (int i = 0; i < altu.length; i++) {
            if(altu_superior>altu_medio){
                System.out.println();
            }
        }
        
        

        
  }
}



    
