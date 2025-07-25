package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main3 {
    public static void iterateAnimals (Collection<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println("Еще один шаг в цикле пройден!");
        }
    }

    public static void iterateCats(Collection<? super Cat> animals) {
        for(int i = 0; i < animals.size(); i++) {

            System.out.println("Еще один шаг в цикле пройден!");
        }
    }

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        iterateAnimals(cats);
        iterateCats(cats);
    }
}
