package org.Stanchik.SkipAndLimit;

import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Stream<String> phoneStream = Stream.of("iPhone 6 S", "Lumia 950", "Samsung Galaxy S 6", "LG G 4", "Nexus 7");
        phoneStream.skip(1).limit(2).forEach(n -> System.out.println(n));
    }
}
