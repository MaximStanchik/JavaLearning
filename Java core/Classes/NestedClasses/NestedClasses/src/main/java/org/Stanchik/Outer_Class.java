package org.Stanchik;

public class Outer_Class {
    void myMethod() {
        int num = 888;

        class MethodInner_Demo {
            public void print() {
                System.out.println("Это метод внутреннего класса: " + num);
            }
        }

        MethodInner_Demo methodInnerDemo = new MethodInner_Demo();
        methodInnerDemo.print();

    }
}

