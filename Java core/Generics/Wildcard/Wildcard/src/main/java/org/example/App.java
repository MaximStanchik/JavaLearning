package org.example;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args ) {
        String str = new String("Test!");
        Object obj = str;

        List<String> strings = new ArrayList<String>();
        List<String> objects = strings;

    }
}
