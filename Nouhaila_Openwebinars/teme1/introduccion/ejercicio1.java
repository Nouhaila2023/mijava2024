package Nouhaila_Openwebinars.teme1.introduccion;

public class ejercicio1{
    public static void main(String[] args) {
        int A = 6;
        int B = 2;
        int C = 3;
        System.out.println("a = " + ((A * B) % C));
        System.out.println("b = " + (A * B / C));
        System.out.println("c = " + (C % B + C *B));
        System.out.println( "d = " + (A % (A + B * C / ( B + C))));
        System.out.println("e = " + ( B * B + C - B  * (A % B)));
    }
}