package org.Stanchik.Intro;

public class App1 {
    public static void main(String[] args) {
        Operationable1 op = new Operationable1() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };
        int z = op.calculate(20, 10);
        System.out.println(z);
    }
}

interface Operationable1 {
    int calculate(int x, int y);
}