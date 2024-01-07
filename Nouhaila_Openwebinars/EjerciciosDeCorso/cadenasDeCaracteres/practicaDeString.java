package Nouhaila_Openwebinars.EjerciciosDeCorso.cadenasDeCaracteres;

public class practicaDeString {
    public static void main(String[] args) {
        
        String msg = "" + 36.9;
        System.out.println(msg);


        String msg1 = String.format("Hola, estoy bien %s ", "¿y tu?" );
        System.out.println(msg1);

        char caracter = 'a';
        String msg2 = String.format("Alejandro Empieza con la letra %c ", 'a');
        System.out.println(msg2);

        int num = 20;
        String msg3 = String.format("%c) \"La suma de :\n 10 + 10 = %d ",caracter ,num );
        System.out.println(msg3);

        double numero = 20.400;
        String msg4 = String.format("La edad de Alejandro es %.3f ", numero );
        System.out.println(msg4);

        System.out.printf("Numero PI: %e\n" , Math.PI);
        
        char ascii = 'A';
        int resultado = (int) ascii;
        System.out.println(resultado);

        


    }    
}
