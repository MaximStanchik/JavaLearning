package org.Stanchik.GettingSubstreamAndMergingStreams;

import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers.takeWhile(n -> n < 0).forEach(n -> System.out.println(n));

        Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5).sorted().takeWhile(n -> n < 0).forEach(n -> System.out.println(n));
        Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5).sorted().dropWhile(n -> n < 0).forEach(n -> System.out.println(n));

        Stream<String> people1 = Stream.of("Tom", "Bob", "Sam");
        Stream<String> people2 = Stream.of("Alice", "Kate", "Sam");

        Stream.concat(people1, people2).forEach(n -> System.out.println(n));

        Stream<String> people = Stream.of("Tom", "Bob", "Sam", "Tom", "Alice", "Kate", "Sam");
        people.distinct().forEach(p -> System.out.println(p));
    }
}
