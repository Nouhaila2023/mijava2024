import java.util.Scanner;

public class practica {
    public static void main(String[] args) {
        //pide un numero del 1 al 10.
        //muestra la tabla de multiplicar de se numero
        int  x = 0;
        Scanner sc = new Scanner(System. in);
        System.out.println("dime un numero");
        x = sc .nextInt();
       for(int i = 1; i<=10; i++){
        for(int j = 1; j<=10; j++){
            System.out.println(i + "*" +j+ "=" +(i*j));
        
        
        
        }  
      }


    }
}
