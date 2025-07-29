package org.Stanchik.LimitationsOfGeneralizations.GenericsAsConstraints;

public class Program{

    public static void main(String[] args) {

        Account<String> acc1 = new Account<String>("1876", 4500);
        Account<String> acc2 = new Account<String>("3476", 1500);

        Transaction<Account<String>> tran1 = new Transaction<Account<String>>(acc1,acc2, 4000);
        tran1.execute();
        tran1 = new Transaction<Account<String>>(acc1,acc2, 4000);
        tran1.execute();
    }
}