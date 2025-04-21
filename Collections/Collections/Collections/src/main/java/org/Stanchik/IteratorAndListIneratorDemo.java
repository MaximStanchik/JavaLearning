package org.Stanchik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorAndListIneratorDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");

        System.out.println("Содержимое al: " + al);

        Iterator it = al.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println(i + "-ый элемент: " + element);
            i = i + 1;
        }

        ListIterator lit = al.listIterator();
        while(lit.hasNext()) {
            Object element = lit.next();
            lit.set(element + "+");
        }
        System.out.println("Измененное содержимое lit:");
        it = al.iterator();

        while (it.hasNext()) {
            Object element = it.next();
            System.out.println(element);
        }

    }
}
