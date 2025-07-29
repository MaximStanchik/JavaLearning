package org.Stanchik.LimitationsOfGeneralizations.InterfacesAsConstraints;

public class Program{

    public static void main(String[] args) {

        Account acc1 = new Account("1235rwr", 5000);
        Account acc2 = new Account("2373", 4300);
        Transaction<Account> tran1 = new Transaction<Account>(acc1, acc2, 1560);
        tran1.execute();
    }
}
