package org.Stanchik;

import java.lang.reflect.Field;

public class MyClass {
    private int number;
    private String name = "default";
    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void printData() {
        System.out.println(number + name);
    }

    public MyClass(int number, String name) {
        this.number = number;
        this.name = name;
    }

}
