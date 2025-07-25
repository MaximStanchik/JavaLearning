package org.Stanchik.Intro;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class App2 {
    //Метод с двумя переменными:
    BiFunction<Integer, Integer, Integer> operation = (x, y) -> x+y;
    int result = operation.apply(5, 10);

    //Метод без параметров:
    Supplier<Integer> getNumber = () -> 30 + 20;
    int number = getNumber.get();

    //Метод с одним параметром (без скобок):
    Function<Integer, Integer> square = n -> n*n;
    int squared = square.apply(4);

    //Метод с одним параметром (с скобками для ясности):
    Function<String, String> greet = (name) -> "Hello, " + name + "!";
    String greeting = greet.apply("Alice");
}
