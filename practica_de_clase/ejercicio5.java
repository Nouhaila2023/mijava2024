import java.util.Scanner;

public class ejercicio5{
    public static void main(String[] args){
        //Programa que pida al usuario un número repetidamente hasta que esté entre 1 y 10
        Scanner sc = new Scanner(System.in);
        int num;
        num =sc.nextInt();
        if(num <= 1 && num >=10 ){
            System.out.println("es corecta");
        }else{
            System.out.println("no es corecta");
        }

    }
}

