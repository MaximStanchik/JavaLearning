package org.Stanchik.GenericInterfaces.FirstStrategy;

public interface Accountable<T> {
    T  getId();
    int getSum();
    void setSum(int sum);
}
