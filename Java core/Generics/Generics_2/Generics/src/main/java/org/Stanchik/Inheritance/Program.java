package org.Stanchik.Inheritance;

public class Program {
    public static void main(String[] args) {
        DepositAccount<Integer, String> dAccount1 = new DepositAccount(20, "Tom");
        System.out.println(dAccount1.getId() + " : " + dAccount1.getName());

        DepositAccount<String, Integer> dAccount2 = new DepositAccount("12345", 23456);
        System.out.println(dAccount2.getId() + " : " + dAccount2.getName());
    }
}
