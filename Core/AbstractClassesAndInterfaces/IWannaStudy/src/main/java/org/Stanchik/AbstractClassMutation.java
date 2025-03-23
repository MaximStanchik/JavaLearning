package org.Stanchik;

public abstract class AbstractClassMutation {
    private String name = "Challenger";
    public void toGiveUp() {

    };

    abstract void doSomething();

    void doSomethingElse() {
        System.out.println("Give up!");
    }

}
