package org.Stanchik.abstractClasses;

abstract class Caravan {
    private double price;
    private String model;
    private String year;
    public abstract void goFast();
    public abstract void changeColor();
    public synchronized void showDetails() {
        System.out.println("!");
    }
}
