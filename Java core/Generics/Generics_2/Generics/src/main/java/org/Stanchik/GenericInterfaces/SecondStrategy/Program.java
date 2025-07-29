package org.Stanchik.GenericInterfaces.SecondStrategy;

public class Program{

    public static void main(String[] args) {

        Account<String> acc1 = new Account<String>("1235rwr", 5000);
        Account<String> acc2 = new Account<String>("2373", 4300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}