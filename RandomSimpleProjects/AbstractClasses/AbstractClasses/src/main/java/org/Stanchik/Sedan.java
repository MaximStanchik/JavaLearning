package org.Stanchik;

public class Sedan extends Car {

    @Override
    public void gas() {
        System.out.println("Закончился бензин в седане!");
    };
    @Override
    public void brake() {
        System.out.println("Седан сломан!");

    };
}
