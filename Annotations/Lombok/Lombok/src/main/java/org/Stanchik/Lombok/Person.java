package org.Stanchik.Lombok;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Person {
    private String name;
    private String surname;
    private int age;

    public static void main(String[] args) {
        Person person = Person.builder()
                .name("John")
                .surname("Doe")
                .age(30)
                .build();

        System.out.println(person);
    }
}
