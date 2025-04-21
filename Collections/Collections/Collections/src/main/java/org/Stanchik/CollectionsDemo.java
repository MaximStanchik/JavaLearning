package org.Stanchik;

import java.util.*;

public class CollectionsDemo
{
    public static void main( String[] args )
    {
        // ArrayList:
        List a1 = new ArrayList();

        a1.add("Заря");
        a1.add(11);
        a1.add("Ivan");

        System.out.println(" ArrayList элементы: ");
        System.out.println("\t" + a1);

        //LinkedList:
        List l1 = new LinkedList();

        l1.add("Заря");
        l1.add(11);
        l1.add("Ivan");

        System.out.println();
        System.out.println(" LinkedList элементы: ");
        System.out.println("\t" + l1);

        //HashSet:
        Set s1 = new HashSet();

        s1.add("Заря");
        s1.add(11);
        s1.add("Ivan");

        System.out.println();
        System.out.println(" HashSet элементы: ");
        System.out.println("\t" + l1);

        //HashMap:
        Map m1 = new HashMap();

        m1.put("Заря", "8");
        m1.put(11, 1);
        m1.put("Ivan", "12");

        System.out.println();
        System.out.println(" HashMap элементы: ");
        System.out.println("\t" + m1);
    }
}
