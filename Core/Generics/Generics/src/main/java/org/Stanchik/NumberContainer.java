package org.Stanchik;

public class NumberContainer<T extends Number> {

    private T number;

    public NumberContainer(T number) {
        this.number = number;
    }

    public void print() {
        System.out.println(number);
    }
}
