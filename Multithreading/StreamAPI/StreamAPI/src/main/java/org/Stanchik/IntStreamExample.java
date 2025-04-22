package org.Stanchik;

import java.util.Iterator;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 11);

        int sum = intStream.sum();
        System.out.println("Сумма всех элементов: " + sum);

        IntStream newStream = IntStream.range(1, 11);

        System.out.println("Вывод всех элементов: ");
        newStream.forEach(i -> System.out.print(i + ", "));
    }
}
