package org.Stanchik;

public class App 
{
    public static void main( String[] args )
    {
        Outer_Demo outer = new Outer_Demo();
        outer.displayInner();

        Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
        System.out.println(inner.getNum());

        Outer_Class outer_Class = new Outer_Class();
        outer_Class.myMethod();


    }
}
