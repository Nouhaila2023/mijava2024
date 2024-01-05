package EjerciciosDeCorso.variableYoperadores;

import java.util.Scanner;

/*
 *Escribir un programa que calcule el área y el perímetro de un 
* rectángulo y la muestre por consola. La `altura` y la `anchura` 
* del mismo la puedes proporcionar como valores iniciales de las variables correspondientes.
*/
public class ejercicio3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner (System.in);

            double área ;
            double perimetro;
            double alto;
            double ancho;

            
            System.out.println("Deme el alto: " );
            alto = Double.parseDouble(sc.nextLine());
            System.out.println(alto);

            
            System.out.println("Deme el ancho: ");
            ancho = Double.parseDouble(sc.nextLine());
            System.out.println(ancho);

            área = alto * ancho;
            System.out.println("El área es: " + área);

            perimetro = (2*alto + 2*ancho);
            System.out.println("El perimetro es: " + perimetro);
            sc.close();
            
        } catch (Exception e) {
            System.out.println("Error");
        }

        


        

    }
}
