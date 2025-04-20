package org.Stanchik;

import java.util.Enumeration;
import java.util.Vector;

public class App
{
    public static void main( String[] args )
    {
        Enumeration days;
        Vector dayNames = new Vector();

        dayNames.add("Понедельник");
        dayNames.add("Вторник");
        dayNames.add("Среда");
        dayNames.add("Четверг");
        dayNames.add("Пятница");
        dayNames.add("Суббота");
        dayNames.add("Воскресенье");

        days = dayNames.elements();

        while(days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }

    }
}
