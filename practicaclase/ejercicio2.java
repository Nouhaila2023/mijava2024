package practicaclase;
/*
 * Dados
Escriba un programa que genere la tirada de 2 dados (de 6 lados) y genere tiradas aleatorias 
y vaya sumando sus resultados hasta que ambos saquen un 6. 
Se deben mostrar todas las tiradas, el número de tiradas realizadas y la suma de ambos dados hasta que sacaron ambos un 6. 
Escribe después una función llamada double[]
estadisticas(int n) que lance un dado aleatoriamente un número n de veces recibido como parámetro 
y debes retornar el porcentaje de apariciones de cada número del dado en las n tiradas (double[]). Pruébalo con n = 100 y n = 1000.
 */
public class ejercicio2 {

    public static int generarNumero(int min, int max) {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }
    public static void main(String[] args) {
        int tirada1=0;
        int contador=0;
        /*
         * genere la tirada de 2 dados (de 6 lados) y genere tiradas aleatorias y vaya sumando sus 
         * resultados hasta que ambos saquen un 6. 
         */
        tirada1 = generarNumero(1,6);
        contador++;
        System.out.println("Tirada: " + tirada1  );
        System.out.println("contador: " + contador);
        double[] estadisticas = new double[6];
        // n =100;
        int n;
        for (int i = 0; i < 100; i++) {
            //dado aleatoriamente un número n
            n = generarNumero(1, 100);
            //un número n de veces recibido como parámetro = 6 de caras 
            for (int j = 0; j < 6; j++) {
               estadisticas[j] /= n;
               //el porcentaje de apariciones
               estadisticas[j] *= 100;
               System.out.println( "un número n de veces recibido como parámetro:  " + n + "el porsentaja: " + j );
            }

        }
        //n = 1000;
        double[] estadisticas1 = new double[100];
        for (int i = 0; i < 6; i++) {
            System.out.println(i + estadisticas1[i]);
        }
        //el parte de examen
    }
}
