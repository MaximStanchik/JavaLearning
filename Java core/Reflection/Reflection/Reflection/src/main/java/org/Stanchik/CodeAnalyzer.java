package org.Stanchik;

import java.util.Arrays;

public class CodeAnalyzer {
    public static void analyzeClass(Object o) {
        Class classOfObjectVar = o.getClass(); // с помощью данного метода определяем класс объекта
        System.out.println("Имя класса: " + classOfObjectVar); // возвращаем полное имя класса
        System.out.println("Поля класса: " + Arrays.toString(classOfObjectVar.getDeclaredFields()));
        System.out.println("Родительский класс: " + classOfObjectVar.getSuperclass());
        System.out.println("Методы класса: " + Arrays.toString(classOfObjectVar.getDeclaredMethods()));
        System.out.println("Конструкторы класса: " + Arrays.toString(classOfObjectVar.getConstructors()));
    }
}
