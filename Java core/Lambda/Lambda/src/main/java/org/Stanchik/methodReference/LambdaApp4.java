package org.Stanchik.methodReference;


public class LambdaApp4 {
    public static void main(String[] args) {
        Operation func = action(1);

        int a = func.execute(6, 5);
        System.out.println(a);

        System.out.println(action(2).execute(3, 4));

    }

    private static Operation action (int number) {
        switch(number) {
            case 1: {
                return (x,y) -> x+y;
            }
            case 2: {
                return (x, y) -> x - y;
            }
            case 3: {
                return (x, y) -> x * y;
            }
            default: {
                return (x,y) -> 0;
            }
        }
    }
}

interface Operation{
    int execute(int x, int y);
}
