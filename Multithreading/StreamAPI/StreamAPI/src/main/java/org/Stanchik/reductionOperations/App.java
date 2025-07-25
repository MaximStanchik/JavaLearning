package org.Stanchik.reductionOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.addAll(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));

        System.out.println(names.stream().count());
        System.out.println(names.stream().filter(n -> n.length() <= 3).count());

        System.out.println(names.stream().findAny().get());
        System.out.println(names.stream().findFirst().get());

        System.out.println(names.stream().allMatch(n -> n.length() > 3));
        System.out.println(names.stream().anyMatch(n -> n.length() > 3));
        System.out.println(names.stream().noneMatch(n -> n.length() > 3));

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));

        Optional<Integer> min = numbers.stream().min(Integer::compare);
        Optional<Integer> max = numbers.stream().max(Integer::compare);

        System.out.println(min.get());
        System.out.println(max.get());
    }
}
