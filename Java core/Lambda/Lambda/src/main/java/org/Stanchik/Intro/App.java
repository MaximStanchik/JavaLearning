package org.Stanchik.Intro;

public class App
{
    public static void main( String[] args )
    {
        Operationable operation = (x,y) -> x+y;
        Operationable operation1 = (int x, int y) -> x*y;
        System.out.println(operation1.calculate(20, 100));

        int result = operation.calculate(10, 20);
        System.out.println(result);
    }
}

interface Operationable {
    int calculate(int x, int y);
}
