package org.Stanchik.parallelPperationsOnArrays;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        int[] numbers = initializeArray(6);
        for(int i: numbers)
            System.out.println(i);

    }
    public static int[] initializeArray(int size) {
        int[] values = new int[size];
        Arrays.parallelSetAll(values, i -> i*10);
        return values;
    }
}
