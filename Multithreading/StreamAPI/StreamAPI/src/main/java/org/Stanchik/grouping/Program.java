package org.Stanchik.grouping;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",450),
                new Phone("Galaxy S9", "Samsung", 440),
                new Phone("Galaxy S8", "Samsung", 340));

        Map<String, List<Phone>> phonesByCompany = phoneStream.collect(Collectors.groupingBy(Phone::getCompany));
        for(Map.Entry<String, List<Phone>> item : phonesByCompany.entrySet()){

            System.out.println(item.getKey());
            for(Phone phone : item.getValue()){

                System.out.println(phone.getName());
            }
            System.out.println();
        }

        Map<Boolean, List<Phone>> phonesByCompany1 = phoneStream.collect(
                Collectors.partitioningBy(p->p.getCompany()=="Apple"));

        for(Map.Entry<Boolean, List<Phone>> item : phonesByCompany1.entrySet()){

            System.out.println(item.getKey());
            for(Phone phone : item.getValue()){

                System.out.println(phone.getName());
            }
            System.out.println();
        }

        Map<String, Long> phonesByCompany2 = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany, Collectors.counting()));

        for(Map.Entry<String, Long> item : phonesByCompany2.entrySet()){

            System.out.println(item.getKey() + " - " + item.getValue());
        }

        Map<String, Integer> phonesByCompany3 = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany, Collectors.summingInt(Phone::getPrice)));

        for(Map.Entry<String, Integer> item : phonesByCompany3.entrySet()){

            System.out.println(item.getKey() + " - " + item.getValue());
        }

        Map<String, Optional<Phone>> phonesByCompany4 = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany,
                        Collectors.minBy(Comparator.comparing(Phone::getPrice))));

        for(Map.Entry<String, Optional<Phone>> item : phonesByCompany4.entrySet()){

            System.out.println(item.getKey() + " - " + item.getValue().get().getName());
        }

        Map<String, IntSummaryStatistics> priceSummary = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany,
                        Collectors.summarizingInt(Phone::getPrice)));

        for(Map.Entry<String, IntSummaryStatistics> item : priceSummary.entrySet()){

            System.out.println(item.getKey() + " - " + item.getValue().getAverage());
        }

        Map<String, List<String>> phonesByCompany5 = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany,
                        Collectors.mapping(Phone::getName, Collectors.toList())));

        for(Map.Entry<String, List<String>> item : phonesByCompany5.entrySet()){

            System.out.println(item.getKey());
            for(String name : item.getValue()){
                System.out.println(name);
            }
        }
    }
}
