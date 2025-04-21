package org.Stanchik;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        int count[] = {34, 22, 10, 60, 30, 22};
        Set set = new HashSet();
        try {
            for (int i  = 0; i <5; i++) {
                set.add(count[i]);
            }
            System.out.println(set);

            TreeSet sortedSet = new TreeSet(set);
            System.out.println("Отсортированный список, хранящий уникальные значения: " + sortedSet);
            System.out.println("Первый элемент набора sortedSet: " + sortedSet.getFirst());
            System.out.println("Последний элемент набора sortedSet: " + sortedSet.getLast());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
