import java.util.Scanner;

public class teme1{
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System. in);
        System.out.println("numero");
        num = sc .nextInt();
        for(int i = 0 ; i < num ; i++){
            System.out.println("escribi un numero");
        if (num > 0){
            System.out.println("mayores que 0");
        }else if ( num < 0){
            System.out.println("menor que 0");
        }else if ( num == 0){
            System.out.println("equoal que 0");

        }
    }
}
}