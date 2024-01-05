import java.util.Scanner;

public class menu {
    
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        int num1, num2, suma;
        int resulta = 0;

    
        System.out.println("que es el premer numero");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("que es el segundo numero");
        num2 = sc.nextInt();
        resulta = num1 + num2;
        System.out.println("num1 + num2 = " + suma);
        while(resulta != 4);
        
        while(num1 !=0){
            resulta += num1 %10;
        }
        while(num2 != 0){
            resulta += num2 % 10;
        }
        for(int i = 2; i < resulta; i++) {
            if (resulta % i == 0);
            }
        if(num1<=1 && num2<=1){                
        }
        for(int i =2;(i < num1) && (i < num2);i++ )
        if( num1 % i == 0){
            
        }if (num2 % i == 0){

        }
    }
    


            
    

    

}

    
