package org.Stanchik.Java;

public class Author5 {
    private int id;
    private String name;
    private String surname;

    public Author5(
            int id,
            String name,
            String surname
    ) {
        if (id == null) {
            throw new NullPointerException("id is marked @NonNull but is null");
        }
        this.id = id;
        if (name == null) {
            throw new NullPointerException("name is marked @NonNull but is null");
        }
        this.name = name;
        this.surname = surname;
    }
}