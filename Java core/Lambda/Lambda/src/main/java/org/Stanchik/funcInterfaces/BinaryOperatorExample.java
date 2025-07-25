package org.Stanchik.funcInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (x,y) -> x*y;
        System.out.println(multiply.apply(10, 100));
        System.out.println(multiply.apply(20, 33));
    }
}
