
    
import java.util.Scanner;

public class nouhaila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("el número es: ");
        var num = sc.nextInt();
        int resulta = 0;
        
        while (resulta != 4) {
          
            resulta = sc.nextInt();
            switch (resulta) {
                case 1:
                    int sum = sumDigits(num);
                    System.out.println("La suma  " + sum);
                    break;
                case 2:
                    boolean isPrime = isPrime(num);
                    if (isPrime) {
                        System.out.println(" es primo.");
                    } else {
                        System.out.println(" no es primo.");
                    }
                    break;
                case 3:
                    int numero += num;
                    System.out.println("La longitud de la circunferencia es: " + numero);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
            }
    
    }

    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    

    
}

