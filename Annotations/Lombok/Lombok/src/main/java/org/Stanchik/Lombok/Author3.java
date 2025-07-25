package org.Stanchik.Lombok;

import lombok.ToString;

@ToString(includeFieldNames=true)
public class Author3 {
    private int id;
    private String name;
    private String surname;
}