package org.Stanchik.dataStructures.Tuple;


import java.util.NoSuchElementException;

public class SimpleTuple<T> implements Tuple<T> {
    private final T[] ts;

    public SimpleTuple(T... ts) {
        this.ts = ts;
    }

    public T get(int index) {
        if (index > -1 && index < ts.length) {
            return ts[index];
        }
        throw new NoSuchElementException();
    }

}
