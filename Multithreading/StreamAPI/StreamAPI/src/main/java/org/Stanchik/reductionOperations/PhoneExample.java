package org.Stanchik.reductionOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneExample {
    public static void main(String[] args) {

        ArrayList<Phone> phones = new ArrayList<Phone>();
        phones.addAll(Arrays.asList(new Phone[]{
                new Phone("iPhone 8", 52000),
                new Phone("Nokia 9", 35000),
                new Phone("Samsung Galaxy S9", 48000),
                new Phone("HTC U12", 36000)
        }));

        Phone min = phones.stream().min(Phone::compare).get();
        Phone max = phones.stream().max(Phone::compare).get();

        System.out.printf("MIN Name: %s Price: %d \n", min.getName(), min.getPrice());
        System.out.printf("MAX Name: %s Price: %d \n", max.getName(), max.getPrice());
    }
}
