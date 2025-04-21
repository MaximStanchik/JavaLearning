package org.Stanchik;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap ihm = new IdentityHashMap();
        ihm.put("Зоя", 3434.34);
        ihm.put("Марк", 123.22);
        ihm.put("Аня", 1378.00);
        ihm.put("Маргарита", 99.22);
        ihm.put("Михаил", -19.08);

        Set set = ihm.entrySet();
        Iterator i = set.iterator();

        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}
