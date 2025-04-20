package org.Stanchik;

public class Outer_Demo {
    private int num = 2048;
    class Inner_Demo {
        public void print() {
            System.out.println("Это внутренний класс");
        }
        public int getNum() {
            System.out.println("Это метод GetNum внутренного класса");
            return num;
        }
    }
    void displayInner() {
        Inner_Demo inner = new Inner_Demo();
        inner.print();
    }
}
