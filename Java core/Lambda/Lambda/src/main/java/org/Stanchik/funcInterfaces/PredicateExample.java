package org.Stanchik.funcInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x>0;
        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-1));
    }
}
