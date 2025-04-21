package org.Stanchik;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        lhs.add(4);
        lhs.add(5);
        lhs.add(6);
        lhs.add(7);
        lhs.add(8);
        lhs.add(9);
        lhs.add(10);

        System.out.println(lhs);

        HashSet hs = new HashSet();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(8);
        hs.add(9);
        hs.add(10);

        System.out.println(hs);

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("kiwi");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("apple");
        linkedHashSet.add("banana");
        linkedHashSet.add("kiwi");

        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }


    }

}
