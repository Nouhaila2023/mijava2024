package Nouhaila_Openwebinars.EjerciciosDeCorso.cadenasDeCaracteres;

public class practica1 {
    public static void main(String[] args) {
        
        String saludo = "hola todos";
        var despedida = "¡hasta luego¡";

        System.out.println(saludo);
        System.out.println(despedida);

        String copia = despedida;
        System.out.println(copia);

        String multilinea = """
                hola a todos
                soy Nouhaila 
                saludos
                """;

        System.out.println(multilinea);

    }    
}
