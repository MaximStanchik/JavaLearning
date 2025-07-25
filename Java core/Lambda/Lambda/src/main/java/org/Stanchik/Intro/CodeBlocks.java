package org.Stanchik.Intro;

public class CodeBlocks {
    public static void main(String[] args) {
        Operationable4 operation = (int x, int y) -> {
            if (y==0) {
                return 0;
            }
            else {
                return x/y;
            }
        };
        System.out.println(operation.calculate(20, 10));
        System.out.println(operation.calculate(20, 0));
    }
}
interface Operationable4 {
    int calculate(int x, int y);
}
