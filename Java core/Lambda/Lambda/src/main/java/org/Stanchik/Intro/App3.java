package org.Stanchik.Intro;

public class App3 {
    static int x = 10;
    static int y = 20;

    public static void main(String[] args) {
        Operation op = () -> {
            x = 30;
            return x+y;
        };
        System.out.println(op.calculate());
        System.out.println(x);
    }
}
interface Operation{
    int calculate();
}