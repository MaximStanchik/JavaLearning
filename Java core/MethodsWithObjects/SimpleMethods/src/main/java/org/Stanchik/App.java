package org.Stanchik;

public class App 
{
    public static void main( String[] args )
    {
        Integer x = 5;

        System.out.println("Перевели в значение byte: " + x.byteValue());
        System.out.println("Перевели в значение short: " + x.shortValue());
        System.out.println("Перевели в значение int: " + x.intValue());
        System.out.println("Перевели в значение long: " + x.longValue());
        System.out.println("Перевели в значение double: " + x.doubleValue());
        System.out.println("Перевели в значение float: " + x.floatValue());

        Person tom = new Person("Tom");
        System.out.println(tom.toString()); // получение и вывод объекта в виде строки
        System.out.println(tom.getClass()); // получение и вывод класса объекта
        System.out.println(tom.hashCode()); // получение и вывод хэш-кода объекта

        String firstNum = new String("5");
        String secondNum = new String("5");

        System.out.println(firstNum.equals(secondNum)); // сравниваем содержимое объектов
        System.out.println(firstNum == secondNum); // сравниваем ссылки на объекты

        if (firstNum == secondNum) { // сравниваем ссылки на объекты
            System.out.println("!");
        }

        try {
            Person tomClone = (Person) tom.clone();
            System.out.println("Клонированный объект: " + tomClone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        tom = null;
        System.gc();

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
