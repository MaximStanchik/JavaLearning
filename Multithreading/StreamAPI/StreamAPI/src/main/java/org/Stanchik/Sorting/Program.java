package org.Stanchik.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<String>();
        Collections.addAll(phones, "iPhone X", "Nokia 9", "Huawei Nexus 6P",
                "Samsung Galaxy S8", "LG G6", "Xiaomi MI6",
                "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6",
                "Pixel 2");
        Collections.addAll(phones, "iPhone X", "Nokia 9", "Huawei Nexus 6P",
                "Samsung Galaxy S8", "LG G6", "Xiaomi MI6",
                "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6",
                "Pixel 2");
        phones.stream().filter(p->p.length()<12).sorted().forEach(s->System.out.println(s));

        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",450),
                new Phone("Nokia 9", "HMD Global",150),
                new Phone("Galaxy S9", "Samsung", 300));
        phoneStream.sorted(new PhoneComparator()).forEach(p->System.out.printf("%s (%s) - %d \n", p.getName(), p.getCompany(), p.getPrice()));
    }
}
