package org.Stanchik;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("Зоя", 3434.34);
        hm.put("Марк", 123.22);
        hm.put("Аня", 1378.00);
        hm.put("Маргарита", 99.22);
        hm.put("Михаил", -19.08);

        Set set = hm.entrySet();
        Iterator i = set.iterator();

        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = ((Double) hm.get("Зоя")).doubleValue();
        hm.put("Зоя", (balance + 1000));
        System.out.println("Новый баланс Зои: " + hm.get("Зоя"));
    }

}
