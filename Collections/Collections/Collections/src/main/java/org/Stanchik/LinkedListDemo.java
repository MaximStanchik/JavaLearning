package org.Stanchik;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.addFirst("A");
        ll.addLast("Z");
        ll.add(1, "B");

        System.out.println("Изначальное содержимое ll: " + ll);

        ll.remove("E");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println("Содержимое ll после удаления некоторых элементов: " + ll);

        Object element = ll.get(2);
        element = "JAVA";
        ll.set(2, element);

        System.out.println("Содержимое ll после изменения некоторых элементов: " + ll);
    }
}
