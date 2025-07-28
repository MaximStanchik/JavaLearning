package org.Stanchik.Deadlock;

public class MyClass1 {
    int counter;
    public synchronized void doSomething() {
        counter++;
    }
}
