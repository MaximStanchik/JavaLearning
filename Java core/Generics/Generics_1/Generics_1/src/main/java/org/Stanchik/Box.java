package org.Stanchik;

public class Box<T> {
    private T t;
    public void add(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box integerBox = new Box();
        Box stringBox = new Box();

        integerBox.add(10);
        stringBox.add("Привет, мир!");

        System.out.println("Integer Value: " + integerBox.get());
        System.out.println("String Value: " + stringBox.get());
    }
}
