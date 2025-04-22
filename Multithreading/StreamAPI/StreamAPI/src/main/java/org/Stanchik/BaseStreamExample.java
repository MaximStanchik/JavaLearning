package org.Stanchik;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class BaseStreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Mike", "Anna");
        Stream<String> nameStream = names.stream();

        System.out.println("Является ли поток параллельным: " + nameStream.isParallel());

        System.out.println("Вывод всех элементов с помощью Iterator: ");
        Iterator<String> iterator = nameStream.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }

        nameStream = names.stream();

        Spliterator<String> spliterator =  nameStream.spliterator();
        System.out.println("Предполагаемый размер: " + spliterator.estimateSize());

        Stream <String> parallelNamesStream = names.stream().parallel();
        System.out.println("Поток параллельный? " + parallelNamesStream.isParallel());

        parallelNamesStream = parallelNamesStream.sequential();
        System.out.println("Поток последовательный? " + parallelNamesStream.isParallel());

        Stream <String> unorderedStream = names.stream().unordered();
        System.out.println("Является ли поток параллельным? " + unorderedStream.isParallel());

        unorderedStream = unorderedStream.parallel();
        System.out.println("Является ли поток параллельным? " + unorderedStream.isParallel());

        unorderedStream = unorderedStream.sequential();
        System.out.println("Является ли поток параллельным? " + unorderedStream.isParallel());
    }

}
