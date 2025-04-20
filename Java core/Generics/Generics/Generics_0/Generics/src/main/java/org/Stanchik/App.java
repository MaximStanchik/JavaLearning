package org.Stanchik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App 
{
    public static class Util {
        public static <T> T getValue(Object obj) {
            return (T) obj;
        }
    }

    public static void main( String[] args ) {
        List list_1 = new ArrayList<>(); // сырой тип
        list_1.add("Hello World!");

        List<String> list_2 = new ArrayList<>(); // типизированный тип
        list_2.add("Hello World!");

        List<String> list_3 = new ArrayList();
        list_3.add("Hello World!");
        String data = list_3.get(0);
        System.out.println(data);


        List list = Arrays.asList(2, 3);
        for (Object element : list) {
            System.out.println(Util.<Integer>getValue(element) + 1);
        }

        SomeType<String> st = new SomeType<>();
        List<String> list_4 = Arrays.asList("test");
        st.test(list_4);


        NumberContainer number_1 = new NumberContainer(2L);
        NumberContainer number_2 = new NumberContainer(1);
        NumberContainer number_3 = new NumberContainer("f");
    }
}


