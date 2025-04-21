package org.Stanchik;

public class Temp {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = 10;
        System.out.println(i1 == i2);

        Integer i3 = 130;
        Integer i4 = 130;
        System.out.println(i3 == i4);

        Integer i5 = new Integer(10);
        Integer i6 = new Integer(10);
        System.out.println(i5 == i6);
    }
}
