package org.Stanchik;

public class MaximumTest {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }
    public static void main(String[] args) {
        System.out.printf("Максимумом из %d, %d и %d является %d\n\n", 3, 4, 5, maximum(3, 4, 5));

        System.out.printf("Максимумом из %.1f, %.1f и %.1f является %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));

        System.out.printf("Максимум из %s, %s и %s является %s\n", "груша", "яблоко", "апельсин", maximum("груша", "яблоко", "апельсин"));
    }
}
