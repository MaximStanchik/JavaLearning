package org.Stanchik;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("Маша", "8");
        m1.put("Михаил", "31");
        m1.put("Олег", "12");
        m1.put("Денис", "14");

        System.out.println();
        System.out.println("Элементы карты: ");
        System.out.println("\t" + m1);
    }
}
