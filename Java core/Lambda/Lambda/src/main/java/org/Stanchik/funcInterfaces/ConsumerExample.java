package org.Stanchik.funcInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> amounts = Arrays.asList(100, 200, 300);
        Consumer<Integer> printer = x->System.out.printf("%d долларов \n", x);
        amounts.forEach(printer);
    }
}
