package org.Stanchik;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Mike", "Anna");
        List<String> filteredNames = names.stream().filter(name -> name.startsWith("J")).collect(Collectors.toList());

        System.out.println("Имена, начинающиеся на J: " + filteredNames);
    }



}
