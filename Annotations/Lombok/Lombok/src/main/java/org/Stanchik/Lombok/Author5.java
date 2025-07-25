package org.Stanchik.Lombok;

import lombok.NonNull;

public class Author5 {
    private int id;
    private String name;
    private String surname;

    public Author5(
            @NonNull int id,
            @NonNull String name,
            String surname
    ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}
