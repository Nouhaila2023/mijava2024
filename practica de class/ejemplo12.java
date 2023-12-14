import java.util.Scanner;

public class ejemplo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("pide un numero");
        numero = sc.nextInt();
        for(int i = numero; i>=1; i--){
            for(int j = 1; j<=i; ++j){
                System.out.print("*");
            }
            System.out.println();
            }   
        
        int n = 5;
        for(int i= 0 ; i<n ; i++ ){
            for( int j = 0 ; j<=( i+1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
