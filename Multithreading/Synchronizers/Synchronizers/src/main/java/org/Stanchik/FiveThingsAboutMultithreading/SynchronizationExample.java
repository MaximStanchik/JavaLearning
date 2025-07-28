package org.Stanchik.FiveThingsAboutMultithreading;

public class SynchronizationExample {
    private int i;

    public synchronized int synchronizedMethodGet() {
        return i;
    }

    public int synchronizedBlockGet() {
        synchronized( this ) {
            return i;
        }
    }
}

