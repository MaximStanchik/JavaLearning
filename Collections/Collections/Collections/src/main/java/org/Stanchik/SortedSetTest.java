package org.Stanchik;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
    public static void main(String[] args) {
        SortedSet set = new TreeSet();

        set.add("a");
        set.add("b");
        set.add("c");

        Iterator it = set.iterator();

        while (it.hasNext()) {
            Object element = it.next();
            System.out.println(element.toString());
        }
    }
}
