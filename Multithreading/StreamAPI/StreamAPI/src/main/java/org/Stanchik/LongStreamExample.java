package org.Stanchik;

import java.util.stream.LongStream;

public class LongStreamExample {
    public static void main(String[] args) {
        LongStream longStream = LongStream.rangeClosed(1, 5);
        long product = longStream.map(x -> x*2).reduce(1, (a, b) -> a * b);
        System.out.println("Произведение элементов, умноженных на 2: " + product);
    }

}
