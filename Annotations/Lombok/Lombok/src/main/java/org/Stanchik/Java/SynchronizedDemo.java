package org.Stanchik.Java;

public class SynchronizedDemo {
    private static final Object $LOCK = new Object[0];
    private final Object $lock = new Object[0];
    private final Object readLock = new Object();

    public static void sayHello() {
        synchronized($LOCK) {
            System.out.println("Hello");
        }
    }

    public int getOne() {
        synchronized($lock) {
            return 1;
        }
    }

    public void printObject() {
        synchronized(readLock) {
            System.out.println(objectToLock);
        }
    }
}
