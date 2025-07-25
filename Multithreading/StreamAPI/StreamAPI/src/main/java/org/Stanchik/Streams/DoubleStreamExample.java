package org.Stanchik.Streams;

import java.util.stream.DoubleStream;

public class DoubleStreamExample {
    public static void main(String[] args) {
        DoubleStream doubleStream = DoubleStream.of(1.5, 2.0, 2.5, 3.0, 4.5, 5.0);
        double average = doubleStream.average().orElse(0);
        System.out.println("Вычисленное среднее значение: " + average);
    }
}
