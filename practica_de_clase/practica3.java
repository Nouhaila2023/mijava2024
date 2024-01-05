public class practica3 {
    public static double calcolador( double a , double b, String op){
        if (op.equals ("+")){
            return a+b;
        }else if (op.equals ("-")){
            return a-b;
        }else{
            return 0;
        }

    }public static void main(String[] args) {
        System.out.println(calcolador(3.5,2.0,"-"));
        System.out.println(calcolador(3, 2, "+"));
    }
}
