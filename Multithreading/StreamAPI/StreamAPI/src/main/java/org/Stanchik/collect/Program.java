package org.Stanchik.collect;

import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 8", 54000),
                new Phone("Nokia 9", 45000),
                new Phone("Samsung Galaxy S9", 40000),
                new Phone("LG G6", 32000));


        Map<String, Integer> phones1 = phoneStream
                .collect(Collectors.toMap(p->p.getName(), t->t.getPrice()));

        phones1.forEach((k,v)->System.out.println(k + " " + v));

        Stream<String> phones = Stream.of("iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        HashSet<String> filteredPhones1 = phones.filter(s->s.length()<12).
                collect(Collectors.toCollection(HashSet::new));

        filteredPhones1.forEach(s->System.out.println(s));
    }
}
