package org.Stanchik;

public class Person implements Cloneable {
    private String name;
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person " + name;
    }

    @Override
    public int hashCode() {
        return 1 * name.hashCode() + 1111;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Person " + name + " is being cleaned up");
        }
        finally {
            super.finalize();
        }
    }
}
