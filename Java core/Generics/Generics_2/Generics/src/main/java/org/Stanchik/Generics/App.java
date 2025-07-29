package org.Stanchik.Generics;

import org.Stanchik.Generics.Account;

public class App
{
    public static void main( String[] args )
    {
        Account<String> acc1 = new Account<String>("2334", 5000);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        Account<Integer> acc2 = new Account<Integer>(5523, 5000);
        System.out.println(acc2.getId());
    }
}
