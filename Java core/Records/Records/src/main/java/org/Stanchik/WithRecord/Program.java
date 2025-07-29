package org.Stanchik.WithRecord;

public class Program{


    public static void main (String args[]){

        Person tom = new Person("Tom",  36);

        System.out.println(tom.name());     // Tom
        System.out.println(tom.age());      // 36
        System.out.println(tom.hashCode());

        Person bob = new Person("Bob", 21);
        Person tomas = new Person("Tom", 36);
        System.out.println(tom.equals(bob));    // false
        System.out.println(tom.equals(tomas));  // true
    }
}

