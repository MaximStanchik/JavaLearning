package org.Stanchik.Deadlock;

public class MyClass2 {
    int counter;
    public void doSomething() {
        synchronized (this) {
            counter ++;
        }
    }
}
