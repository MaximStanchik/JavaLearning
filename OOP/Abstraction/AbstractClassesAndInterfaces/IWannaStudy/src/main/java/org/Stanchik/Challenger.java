package org.Stanchik;

public interface Challenger {
    void doChallenge();
    default void doSomething () {
        System.out.println("Challenger doing a challenge!");
    };

}
