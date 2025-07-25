package org.Stanchik.Intro;

public class LambdaApp6 {
    public static void main(String[] args) {
        Operationable6<Integer> operation1 = (x, y) -> x + y;
        Operationable6<String> operation2 = (x, y) -> x + y;

        System.out.println(operation1.calculate(20, 10));
        System.out.println(operation2.calculate("20", "10"));
    }
}
interface Operationable6<T> {
    T calculate (T x, T y);
}
