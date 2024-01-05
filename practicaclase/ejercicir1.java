package practicaclase;

import java.util.Scanner;

/*
 * Vocales
Realiza una función que reciba como parámetro una cadena y una vocal (a,e,i,o,u) y devuelva como 
resultado la cadena inicial sustituyendo todas las vocales por la vocal introducida. 
Debe funcionar con mayúsculas y minúsculas, es decir, si la vocal a sustituir es la a, y encuentra una E, 
el resultado de la sustitución será una A.
Ejemplo: “Mi amiga Ana es prima de Eva y de Irene”, le pasamos la ‘e’ y el resultado sería:
“Me emege Ene es preme de Eve y de Erene”.
No se pueden usar los métodos replace ni replaceAll de String ni StringBuffer.
Para sacar más nota se recomienda usar una estructura mutable (StringBuffer o StringBuilder) para hacer la sustitución.
 */
public class ejercicir1 {
    public static String sustituirVocales(String cadena, char cambiar) {
        //hola prof no se como etulizar el StringBuilder pero lo se que es de cambiar el letras ?? la for y if me lo hago yo gracias
        cadena = "Mi amiga Ana es prima de Eva y de Irene";
        StringBuilder sc = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            if (cambiar == 'a' || cambiar == 'e' || cambiar == 'i' || cambiar == 'o' || cambiar == 'u' ||cambiar == 'A' || cambiar == 'E' || cambiar == 'I' || cambiar == 'O' || cambiar == 'U') {
                System.out.println(cambiar);
            } else {
                System.out.println("error");
            }
        }
        return sc.toString();
    }     
}
