package org.Stanchik;

import java.util.Enumeration;
import java.util.Vector;

public class App
{
    public static void main( String[] args )
    {
        Vector v = new Vector(3, 2);
        System.out.println("Изначальный размер вектора v: " + v.size());
        System.out.println("Изначальная емкость вектора v: " + v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("Ёмкость после четырёх сложений: " + v.capacity());
        v.addElement(5.45);
        System.out.println("Текущая ёмкость: " + v.capacity());

        v.addElement(6.08);
        v.addElement(7);
        System.out.println("Текущая ёмкость: " + v.capacity());

        v.addElement(9.4);
        v.addElement(10);
        System.out.println("Текущая ёмкость: " + v.capacity());

        v.addElement(11);
        v.addElement(12);
        System.out.println("Первый элемент: " + (Integer)v.firstElement());
        System.out.println("Последний элемент: " + (Integer)v.lastElement());

        if (v.contains(11)) {
            System.out.println("Вектор содержит 11");
        }

        System.out.println("Задание: перечислить все элементы вектора: ");
        Enumeration venum = v.elements();
        while(venum.hasMoreElements()) {
            System.out.print(venum.nextElement() + ", ");
        }

    }
}
