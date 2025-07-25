package org.Stanchik.Streams;

import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class IntStreamExample {
    public static void main(String[] args) {
        LongStream longStream = LongStream.range(1, 11);

        long sum = longStream.sum();
        System.out.println("Сумма всех элементов: " + sum);

        LongStream newStream = LongStream.range(1, 11);

        System.out.println("Вывод всех элементов: ");
        newStream.forEach(i -> System.out.print(i + ", "));
    }
}
