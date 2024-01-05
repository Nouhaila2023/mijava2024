public class practica5 {
 /* 5. Leer 10 números enteros y a continuación mostrar la media de los números introducidos, el mayor valor y el
menor valor. Usar un array para almacenar los valores y sacar toda la información en una sola iteración del array.
Si puedes mejóralo implementando una función para cada tarea (media, mayor, menor), pasando el array*/
    public static void main(String[] args) {
        int []numeros = {1,2,3,4,5,6,7,8,9,10}; 
        int mayor=numeros[0];
        int menor=numeros[0];
        int suma=0 ;              
        for (int i = 0; i < numeros.length; i++) {       
            suma += numeros[i]; 
            if  (numeros[i]> mayor) {
                mayor=numeros[i] ;
            }else if (numeros[i] < menor){
                numeros[i]=menor;
            }
        }                    
        System.out.println("la suma es: "+suma);
        double medio =(double) suma/10;
        System.out.println("el medio es: " + medio);            
        System.out.println("el mayor es: " + mayor);
        System.out.println("el menor es: " + menor);
    }
}