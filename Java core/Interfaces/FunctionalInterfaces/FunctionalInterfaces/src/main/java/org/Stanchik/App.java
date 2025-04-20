package org.Stanchik;

import java.util.ArrayList;
import java.util.function.*;

public class App
{
    public static void main( String[] args )
    {
        Dog dog = new Dog("Boobie", 5, 3);
        Converter<Dog, Raccoon> converter = x -> new Raccoon(x.name, x.age, x.weight);
        Raccoon raccoon = converter.convert(dog);
        System.out.println("Raccoon has parameters: name - " + raccoon.name + ", age - " + raccoon.age + ", weight - " + raccoon.weight);

        Predicate<Integer> isEvenNumber = x -> x % 2 == 0;
        System.out.println(isEvenNumber.test(4));

        Consumer<String> greetings = x -> System.out.println("Hello " + x + " !!!");
        greetings.accept("Elena");

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Elena");
        nameList.add("John");
        nameList.add("Alex");
        nameList.add("Jim");
        nameList.add("Sara");

        Supplier<String> randomName = () -> {
            int value = (int)(Math.random() * nameList.size());
            return nameList.get(value);
        };

        System.out.println(randomName.get());

        Function<String, Integer> valueConverter = x -> Integer.valueOf(x);
        System.out.println(valueConverter.apply("678"));

        UnaryOperator<Integer> squareValue = x -> x*x;
        System.out.println(squareValue.apply(9));
    }
}
