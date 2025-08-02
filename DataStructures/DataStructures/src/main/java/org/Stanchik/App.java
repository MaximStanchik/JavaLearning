package org.Stanchik;

import org.Stanchik.dataStructures.Heap.MaxHeap;
import org.Stanchik.dataStructures.Pair.SimplePair;
import org.Stanchik.dataStructures.Tuple.SimpleTuple;
import org.Stanchik.dataStructures.Tuple.Tuple;
import org.Stanchik.dataStructures.Pair.Pair;

import java.util.TreeMap;
import java.util.TreeSet;

public class App
{
    public static void main( String[] args )
    {
        Tuple<Integer> numbers = new SimpleTuple<Integer>(10, 20, 30);
        System.out.println(numbers.get(0));

        Pair<Integer, String> pair = new SimplePair<Integer, String>(10, "Hello World!");

        TreeSet<Integer> numbersTree = new TreeSet<Integer>();
        numbersTree.add(5);
        numbersTree.add(1);
        numbersTree.add(10);

        System.out.println(numbersTree);

        System.out.println("Min: " + numbersTree.first());
        System.out.println("Max: " + numbersTree.last());


        TreeMap<String, Integer> ages = new TreeMap<>();
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);

        System.out.println(ages);

        System.out.println("Возраст Боба: " + ages.get("Bob"));

        System.out.println("Первый по алфавиту: " + ages.firstKey());
        System.out.println("Последний по алфавиту: " + ages.lastKey());

        MaxHeap maxHeap = new MaxHeap(10);

        maxHeap.insert(10);
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(5);
        maxHeap.insert(30);

        System.out.println("Max value: " + maxHeap.extractMax());
        System.out.println("Max value: " + maxHeap.extractMax());
    }
}

