package org.Stanchik.funcInterfaces;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, String> convert = x->x + " долларов";
        System.out.println(convert.apply(5));
    }
}
