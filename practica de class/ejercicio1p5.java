import java.util.Scanner;

public class ejercicio1p5 {
 /*
 * Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector con datos leídos por el teclado. 
Copia los elementos del vector en otro vector, pero en orden inverso, y muéstralo por la pantalla */
    public static void main(String[] args) {
        
        
        String Palabra1[] = new String[5];
        String Palabra2[] = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("tu palabra");
        for (int i = 0; i< Palabra1.length; i++){
            
            Palabra1[i] = sc.nextLine();
        }
        for(int i = Palabra2.length-1; i>=0;i--){
            Palabra2[Palabra1.length-1-i] = Palabra1[i];
        }
       
        for (int i = 0; i< Palabra2.length; i++){
            
            System.out.println(Palabra2[i]);            
        }
    }
}
