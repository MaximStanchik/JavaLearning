package org.Stanchik;

import java.lang.reflect.Field;

public class DeduplicationDemo {
    public static void main(String[] args) throws InterruptedException, NoSuchFieldException, IllegalAccessException {
        char[] chars = {'T', 'o', 'p', 'J', 'a', 'v', 'a'};
        String[] strings = {new String(chars), new String(chars) , "TopJava"};
        Field value = String.class.getDeclaredField("value");
        value.setAccessible(true);

        System.out.println("Хэш первого объекта: " + value.get(strings[0]));
        System.out.println("Хэш второго объекта: " + value.get(strings[1]));
        System.out.println("Хэш второго объекта: " + value.get(strings[2]));

        System.gc();
        System.out.println("Запустили сборщик мусора!");
        Thread.sleep(1000);

        System.out.println("Хэш первого объекта: " + value.get(strings[0]));
        System.out.println("Хэш второго объекта: " + value.get(strings[1]));
        System.out.println("Хэш второго объекта: " + value.get(strings[3]));
    }
}
