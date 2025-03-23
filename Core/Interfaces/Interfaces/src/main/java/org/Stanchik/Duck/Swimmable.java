package org.Stanchik.Duck;

public interface Swimmable {
    public default void swim() {
        System.out.println("Плыви!");
    };
    public void eat();
    public void run();
};
