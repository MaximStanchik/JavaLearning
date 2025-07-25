package org.Stanchik.Lombok;

import lombok.Synchronized;

public class SynchronizedDemo {
    private final Object objectToLock = new Object();

    @Synchronized
    public static void sayHello() {
        System.out.println("Hello!");
    }
    @Synchronized
    public int getOne() {
        return 1;
    }

    @Synchronized("objectToLock")
    public void printObject() {
        System.out.println(objectToLock);
    }
}
