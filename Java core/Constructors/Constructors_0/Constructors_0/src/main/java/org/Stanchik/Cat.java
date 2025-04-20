package org.Stanchik;

public class Cat {
    String name;
    int age;
    public Cat() {
        System.out.println("Создали кота про которого ничего не знаем!");
    }

    public Cat(String name, int age) {
        System.out.println("Создали кота про которого знаем имя и возраст!");
        this.name = name;
        this.age = age;
    }
}
