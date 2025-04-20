package org.Stanchik;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class App
{
    public static void main( String[] args )
    {
        Dictionary<String, Integer> dictionary = new Hashtable<String, Integer>();

        dictionary.put("Алексей", 1000);
        dictionary.put("Маша", 2000);
        dictionary.put("Саша", 3000);

        Enumeration<String> names = dictionary.keys();
        Enumeration<Integer> balances = dictionary.elements();

        System.out.println("Вывод всех имен (без балансов): ");
        while (names.hasMoreElements()) {
            System.out.println(names.nextElement());
        }

        System.out.println("Вывод всех балансов (без имен): ");
        while (balances.hasMoreElements()) {
            System.out.println(balances.nextElement());
        }

        System.out.println(dictionary.size());
        names = dictionary.keys();
        System.out.println("Вывод всех имен с балансами: ");
        while (names.hasMoreElements()) {
            String name = names.nextElement();
            Integer value = dictionary.get(name);
            System.out.println(name + ": " + value);
        }

    }
}
