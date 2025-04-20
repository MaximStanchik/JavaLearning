package org.Stanchik;

public class Print {
    void print(String s) {
        if (s == null) {
            throw new NullPointerException("Exception s is null!");
        }
        else {
            System.out.println("Inside method print " + s);
        }
    }
}
