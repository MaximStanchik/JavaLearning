package org.Stanchik;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App
{
    private static void printData(Object myClass) {
        try {
            Method method = myClass.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            method.invoke(myClass);
        }
         catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main( String[] args )
    {
        MyClass myClass = new MyClass(1, "2");
        int number = myClass.getNumber();
        String name = "";
        System.out.println("Number: " + number + ". Name: " + name + " .");
        try {
            Field field = myClass.getClass().getDeclaredField("name");
            field.setAccessible(true);
            field.set(myClass, "1111");
            name = (String) field.get(myClass);
        }
        catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("Number: " + number + ". Name: " + name + " .");

        System.out.println("Все публичные поля в классе MyClass, включая унаследованные от родительского класса:");
        Field[] allPublicFields = myClass.getClass().getFields();
        for (int i = 0; i < allPublicFields.length; i++) {
            System.out.println(allPublicFields[i]);
        }

        System.out.println("Все поля (публичные, приватные, private-package, статические) в классе MyClass, но без унаследованных от родительского класса:");
        Field[] allFields = myClass.getClass().getDeclaredFields();
        for (int i = 0; i < allFields.length; i++) {
            System.out.println(allFields[i]);
        }

        printData(myClass);

        System.out.println("Название класса объекта: " + myClass.getClass().getName());

        System.out.println("Создание класса с помощью рефлексии: ");
        try {
            Class clazz = Class.forName(MyClass.class.getName());
            Class[] params = {int.class, String.class};
            myClass = (MyClass) clazz.getConstructor(params).newInstance(1, "default2");
            System.out.println(myClass);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
        catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Получение параметров конструктора класса MyClass: ");

        Constructor[] constructors =  myClass.getClass().getConstructors();
        for (Constructor constructor : constructors) {
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + ", ");
            }
            System.out.println();
        }
    }
}

