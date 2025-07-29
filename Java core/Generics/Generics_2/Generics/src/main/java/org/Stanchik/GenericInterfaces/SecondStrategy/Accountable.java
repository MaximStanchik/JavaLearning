package org.Stanchik.GenericInterfaces.SecondStrategy;

interface Accountable<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}
