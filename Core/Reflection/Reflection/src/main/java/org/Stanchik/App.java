package org.Stanchik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.Stanchik.CodeAnalyzer.analyzeClass;

public class App
{
    public static Cat createCat_1() throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String className = reader.readLine();

        Class classNameOfObject = Class.forName(className);
        Cat cat = (Cat) classNameOfObject.newInstance(); // приведение типа. данный созданный объект является экземпляром класса Cat

        return cat;
    }

    public static Object createObject() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String className = reader.readLine();

        Class clazz = Class.forName(className);
        Object result = clazz.newInstance();
        return result;
    }

    public static Cat createCat_2(Object o) {
        Cat cat = null;
        try {
            Class clazz = o.getClass();
            cat = (Cat) clazz.newInstance();

            cat.setName("Barsik");

            Field age = clazz.getDeclaredField("age");

            age.setAccessible(true);
            age.set(cat, 6);
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        }
        catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return cat;
    }

    public static Cat createCat_3(Object o) {
        Class clazz = o.getClass();
        Cat cat = null;
        try {
            Class[] catClassParams = {String.class, int.class};
            cat = (Cat) clazz.getConstructor(catClassParams).newInstance("Barsik", 6);
        }
        catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return cat;
    }

    public static void invokeSayMeowMethod() {
        Class clazz = null;
        Cat cat = null;
        try {
            cat = new Cat("Barsik", 6);

            clazz = Class.forName(Cat.class.getName());
            Method sayMeow = clazz.getDeclaredMethod("sayMeow"); // получение объявленного метода

            sayMeow.setAccessible(true); // делаем метод доступным для вызова
            sayMeow.invoke(cat); // вызываем метод у нужного объекта
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main( String[] args ) throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        //System.out.println(createCat_1());

        Cat cat = new Cat("Shpuntik", 10);
        analyzeClass(cat);
        System.out.println(createCat_2(cat));
        System.out.println(createCat_3(cat));
        invokeSayMeowMethod();
    }
}
