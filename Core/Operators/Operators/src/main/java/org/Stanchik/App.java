package org.Stanchik;

public class App 
{
    public static void main( String[] args )
    {
        int a = 0b00111100;
        int b = 0b00001101;

        System.out.println("Число a в двоичном виде: " + a);
        System.out.println("Число b в двоичном виде: " + b);

        System.out.println("Побитовое и: " + (a&b));
        System.out.println("Побитовое или: " + (a|b));
        System.out.println("Побитовое логическое или: " + (a^b));

        System.out.println("Побитовое дополнение a: " + (~a));
        System.out.println("Побитовое дополнение b: " + (~b));

        System.out.println("Сдвиг влево a: " + (a << 2));
        System.out.println("Сдвиг влево b: " + (b << 2));

        System.out.println("Сдвиг вправо a: " + (a >> 2));
        System.out.println("Сдвиг вправо b: " + (b >> 2));

        String name = "Max";
        boolean result = name instanceof String;
        System.out.println("name типа String? " + result);

        int a1, b1;
        a1 = 10;
        b1 = (a1 == 1) ? 20 : 30;
        System.out.println("Значение b1: " + b1);

        b1 = (a1 == 10) ? 35 : 45;
        System.out.println("Значение b1: " + b1);

    }
}
