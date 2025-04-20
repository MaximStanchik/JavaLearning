package org.Stanchik;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class App
{
    public static void main( String[] args )
    {
        Properties capitals = new Properties();
        Set states;
        String str;

        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джефферсон-Сити");
        capitals.put("Вашингтона", "Олимпия");
        capitals.put("Калифорнии", "Сакраменто");
        capitals.put("Индианы", "Индианаполис");

        System.out.println("Получение значения по ключу: " + capitals.get("Иллинойс"));
        System.out.println("Получение значения по ключу: " + capitals.get("Миссури"));
        System.out.println("Получение значения по ключу: " + capitals.get("Вашингтона"));
        System.out.println("Получение значения по ключу: " + capitals.get("Калифорнии"));
        System.out.println("Получение значения по ключу: " + capitals.get("Индианы"));

        states = capitals.keySet();
        Iterator itr = states.iterator();

        while (itr.hasNext()) {
            str = (String) itr.next();
            System.out.println("Столицей " + str + " является " + capitals.getProperty(str) + ".");
        }

        str = capitals.getProperty("Флорида", "Не Найдена");
        System.out.println("Столица Флориды " + str + ".");
    }
}
