package org.Stanchik.Duck;

public class Duck implements Swimmable {
    public void eat() {

    };
    public void run() {

    };

    public static void main( String[] args )
    {
        Duck duck = new Duck();
        duck.swim();
        duck.eat();
        duck.run();
    };
};