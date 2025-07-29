package org.Stanchik.GenericInterfaces.FirstStrategy;

import org.Stanchik.GenericInterfaces.FirstStrategy.Account;
import org.Stanchik.GenericInterfaces.FirstStrategy.Accountable;

public class Program {
    public static void main(String[] args) {
        Accountable<String> acc1 = new Account("1235rwr", 5000);
        Account acc2 = new Account("2373", 4300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}
