package org.Stanchik;

import java.util.Enumeration;
import java.util.Hashtable;

public class App
{
    public static void main( String[] args )
    {
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        balance.put("Маша", 3434.34);
        balance.put("Михаил",123.22);
        balance.put("Олег", 1378.00);
        balance.put("Денис", 99.22);
        balance.put("Антон", -19.08);

        names = balance.keys();
        while (names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }

        bal = (double) balance.get("Маша");
        balance.put("Маша", bal + 1000);
        System.out.println("новый баланс Маши: " + balance.get("Маша"));
    }
}
