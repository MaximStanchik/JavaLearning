package org.Stanchik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Creating {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
        cities.stream().filter(s->s.length() == 6).forEach(s->System.out.println(s));

        Stream<String> citiesStream = Arrays.stream(new String[] {"Париж", "Лондон", "Мадрид"});
        citiesStream.forEach(s->System.out.println(s));
    }
}
