package Nouhaila_Openwebinars.EjerciciosDeCorso.estructurasDeControl;

import java.util.Scanner;

/*
 * 15. Aunque no lo parezca, siguen existiendo locutorios para realizar llamadas telefónicas internacionales. 
 * El coste cuando se realiza una llamada es el siguiente:
- Como base, se cobran 0.50€ si el otro usuario coge el teléfono.
- Los primeros 3 minutos cuestan 0.75€ por minuto.
- Los siguientes 4 minutos, cuestan 0.65€ por minuto.
- A partir del 8º minuto, cuestan 0.50€ por minuto.
- Si la llamada se realiza por la noche (22:00 - 7:59), tiene un recargo de un 5% sobre el precio.
- Si la llamada se realiza en domingo, tiene un recargo del 3%
Implementar un programa en Java que pida por teclado todos los datos necesarios e implemente 
el algoritmo de cálculo del precio final de una llamada

15. على الرغم من أن الأمر قد لا يبدو كذلك، إلا أنه لا تزال هناك مراكز اتصال لإجراء المكالمات الهاتفية الدولية. التكلفة عند إجراء المكالمة هي كما يلي:
- كقاعدة أساسية، يتم تحصيل 0.50 يورو إذا التقط المستخدم الآخر الهاتف.
- تكلفة أول 3 دقائق 0.75 يورو للدقيقة.
- تكلفة الدقائق الأربع التالية هي 0.65 يورو للدقيقة.
- ابتداءً من الدقيقة الثامنة فصاعدًا، تبلغ تكلفة الدقيقة 0.50 يورو.
- إذا تم إجراء المكالمة ليلاً (10:00 مساءً - 7:59 صباحًا)، يتم فرض رسوم إضافية بنسبة 5% على السعر.
- في حالة إجراء المكالمة يوم الأحد، يتم فرض رسوم إضافية بنسبة 3%
تنفيذ برنامج Java الذي يطلب جميع البيانات اللازمة عن طريق لوحة المفاتيح وتنفيذ خوارزمية حساب السعر النهائي للمكالمة
 */



public class ejercicio15 {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("هل التقط المستخدم الآخر الهاتف؟ (نعم/لا): ");
        String isAnswered = scanner.nextLine().toLowerCase();

        System.out.print("المدة بالدقائق: ");
        int duration = scanner.nextInt();

        System.out.print("هل المكالمة في وقت الليل؟ (نعم/لا): ");
        String isNight = scanner.next().toLowerCase();

        System.out.print("هل المكالمة يوم الأحد؟ (نعم/لا): ");
        String isSunday = scanner.next().toLowerCase();

        double baseCost = isAnswered.equals("نعم") ? 0.50 : 0;
        double costPerMinute;

        if (duration <= 3) {
            costPerMinute = 0.75;
        } else if (duration <= 7) {
            costPerMinute = 0.65;
        } else {
            costPerMinute = 0.50;
        }

        if (isNight.equals("نعم")) {
            costPerMinute *= 1.05; // زيادة 5%
        }

        if (isSunday.equals("نعم")) {
            costPerMinute *= 1.03; // زيادة 3%
        }

        double totalCost = baseCost + (duration * costPerMinute);

        System.out.println("التكلفة الإجمالية للمكالمة هي: " + totalCost + " يورو.");

        scanner.close();*/


        Scanner sc = new Scanner(System.in);

        String domingo;
        double minuto;
        String noche;
        double total;
        String coge_tele;

        System.out.print("El osuario a coge el telefono (si/no): ");
        coge_tele = sc.nextLine();

        System.out.print("cuantos minuto quieres hablar: ");
        minuto = Double.parseDouble(sc.nextLine());

        System.out.print("Quieres la llamad en el nuche (si/no): ");
        noche = sc.nextLine();

        System.out.print("Quieres la llamad en domingo (si/no): ");
        domingo = sc.nextLine();

        if (minuto <= 3) {
            System.out.println(minuto * 0.75);
        } else {
            
        }












    }
}





    
        
  
